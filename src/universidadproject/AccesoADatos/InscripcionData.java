
package universidadproject.AccesoADatos;


import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadproject.Entidades.*;


public class InscripcionData extends Conexion{
    private AlumnoData alumno = new AlumnoData();
    private MateriaData materia = new MateriaData();
    
    public void guardarInscripcion(Inscripcion inscripcion) {
        try{
            if(inscripcion == null){
                JOptionPane.showMessageDialog(null, "Debe indicar una inscripcion valida");
            }
            conectarBase();
            String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                    + "VALUES (?,?,?)";
            sentencia = conexion.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            sentencia.setDouble(1, inscripcion.getNota());
            sentencia.setInt(2, inscripcion.getAlumno().getIdAlumno());
            sentencia.setInt(3, inscripcion.getMateria().getIdMateria());
            sentencia.executeUpdate();
            resultado = sentencia.getGeneratedKeys();
            if(resultado.next()){
                inscripcion.setIdInscripcion(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "La inscripcion se realizo con exito");
            }
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }finally{
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base "+ex);
            }
        }
        
    }
    
    public ArrayList<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> lista = new ArrayList();
        try{
            conectarBase();
            String sql = "SELECT * FROM inscripcion";
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Inscripcion inscripcion;
            while(resultado.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultado.getInt(1));
                inscripcion.setNota(resultado.getDouble(2));
                //Uso de clases Data
                inscripcion.setAlumno(alumno.buscarAlumnoPorId(resultado.getInt(3)));
                inscripcion.setMateria(materia.buscarMateria(resultado.getInt(4)));
                
                lista.add(inscripcion);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }finally{
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base "+ex);
            }
        }
        return lista;
    }
    
    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(Integer id){
        ArrayList<Inscripcion> lista = new ArrayList();
        try{
            if(id == null)
                JOptionPane.showMessageDialog(null, "Ingrese un id valido");
            
            conectarBase();
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = "+id;
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Inscripcion inscripcion;
            while(resultado.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultado.getInt(1));
                inscripcion.setNota(resultado.getInt(2));
                //Uso de clases Data
                inscripcion.setAlumno(alumno.buscarAlumnoPorId(resultado.getInt(3)));
                inscripcion.setMateria(materia.buscarMateria(resultado.getInt(4)));
                lista.add(inscripcion);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }finally{
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base "+ex);
            }
        }
        return lista;
    }
    
    public ArrayList<Materia> obtenerMateriasCursadas(Integer id){
        ArrayList<Materia> lista = new ArrayList();
        try{
            if(id == null)
                JOptionPane.showMessageDialog(null, "Ingrese un id valido");
            
            conectarBase();
            
            String sql = "SELECT materia.idMateria, materia.nombre, materia.anio, materia.estado " +
                "FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria) " +
                "WHERE idAlumno = " + id;
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Materia materia;
            while(resultado.next()){
                materia = new Materia();
                materia.setIdMateria(resultado.getInt(1));
                materia.setNombre(resultado.getString(2));
                materia.setAnioMateria(resultado.getInt(3));
                materia.setActivo(resultado.getBoolean(4));
                lista.add(materia);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }finally{
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de la base "+ex);
            }
        }
        return lista;
    }
    
    public ArrayList<Materia> obtenerMateriasNOCursadas(Integer id) {
        ArrayList<Materia> lista = new ArrayList();
        try{
            if(id == null)
                JOptionPane.showMessageDialog(null, "Ingrese un id valido");
            
            conectarBase();
            
            String sql = "SELECT materia.idMateria, materia.nombre, materia.anio, materia.estado " +
                "FROM inscripcion RIGHT JOIN materia ON (inscripcion.idMateria = materia.idMateria) " +
                "AND (inscripcion.idAlumno = ?) " +
                "WHERE inscripcion.idMateria IS NULL";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();
            Materia materia;
            while(resultado.next()){
                materia = new Materia();
                materia.setIdMateria(resultado.getInt(1));
                materia.setNombre(resultado.getString(2));
                materia.setAnioMateria(resultado.getInt(3));
                materia.setActivo(resultado.getBoolean(4));
                lista.add(materia);
            }
            desconectarBase();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return lista;
    }
    
    public void borrarInscripcionAlumnoMateria(Integer idAlumno, Integer idMateria){
        try{
            if(idAlumno == null || idMateria == null)
                JOptionPane.showMessageDialog(null, "Ingrese id's validos");
            
            conectarBase();
            String sql = "DELETE FROM inscripcion " +
                "WHERE idAlumno = ? AND idMateria = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, idAlumno);
            sentencia.setInt(2, idMateria);
            int i = sentencia.executeUpdate();
            
            if(i == 1)
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada de forma exitosa");
            else
                JOptionPane.showMessageDialog(null, "Error al eliminar la inscripcion");
            
            desconectarBase();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    public void actualizarNota(Integer idAlumno, Integer idMateria, double nota){
        try{
            if(idAlumno == null || idMateria == null)
                JOptionPane.showMessageDialog(null, "Ingrese id's validos");
            
            conectarBase();
            String sql = "UPDATE inscripcion SET nota = ? " +
                "WHERE idAlumno = ? AND idMateria = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setDouble(1, nota);
            sentencia.setInt(2, idAlumno);
            sentencia.setInt(3, idMateria);
            int i = sentencia.executeUpdate();
            if(i > 0)
                JOptionPane.showMessageDialog(null, "Nota actualizada de forma exitosa");
            
            desconectarBase();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    public ArrayList<Alumno> obtenerAlumnosPorMateria(Integer idMateria){
        ArrayList<Alumno> lista = new ArrayList();
        try{
            if(idMateria == null)
                JOptionPane.showMessageDialog(null, "Ingrese un id valido");
            
            conectarBase();
            String sql = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre, alumno.fechaNacimiento, alumno.estado " +
                "FROM inscripcion JOIN alumno ON (inscripcion.idAlumno = alumno.idAlumno) " +
                "WHERE idMateria = " + idMateria;
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Alumno alumno;
            while(resultado.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt(1));
                alumno.setDni(resultado.getInt(2));
                alumno.setApellido(resultado.getString(3));
                alumno.setNombre(resultado.getString(4));
                alumno.setFechaNac(resultado.getDate(5).toLocalDate());
                alumno.setEstado(resultado.getBoolean(6));
                lista.add(alumno);
            }
            desconectarBase();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return lista;
    }
}
