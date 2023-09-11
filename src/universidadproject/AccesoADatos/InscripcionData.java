
package universidadproject.AccesoADatos;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadproject.Entidades.Inscripcion;
import universidadproject.Entidades.Materia;


public class InscripcionData extends Conexion{
    private AlumnoData alumno;
    private MateriaData materia;
    
    public void guardarInscripcion(Inscripcion inscripcion) throws Exception{
        try{
            if(inscripcion == null){
                JOptionPane.showMessageDialog(null, "Debe indicar una inscripcion valida");
            }
            conectarBase();
            String sql = "INSERT INTO inscripcion (nota, alumno, materia)"
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
            desconectarBase();
        }catch(Exception ex){
            desconectarBase();
            throw ex;
        }
        
    }
    
    public ArrayList<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> lista = new ArrayList();
        try{
            conectarBase();
            String sql = "SELECT * FROM incripcion";
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Inscripcion inscripcion;
            while(resultado.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultado.getInt(1));
                inscripcion.setNota(resultado.getInt(2));
                //Necesito la clase AlumnoData
                //inscripcion.setAlumno(alumno.buscarAlumno(resultado.getInt(3)));
                //Necesito la clase MateriaData
                //inscripcion.setMateria(materia.buscarMateria(resultado.getInt(4)));
                
                lista.add(inscripcion);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null , "Problema al conectar a la base");
        }
        return lista;
    }
    
    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(Integer id) throws Exception{
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
                //Faltan las clases data
                //inscripcion.setAlumno(alumno.buscarAlumno(resultado.getInt(3)));
                //inscripcion.setMateria(materia.buscarMateria(resultado.getInt(4)));
                lista.add(inscripcion);
            }
            desconectarBase();
        }catch(Exception ex){
            desconectarBase();
            throw ex;
        }
        return lista;
    }
    
    public ArrayList<Materia> obtenerMateriasCursadas(Integer id) throws Exception{
        ArrayList<Materia> lista = new ArrayList();
        try{
            if(id == null)
                JOptionPane.showMessageDialog(null, "Ingrese un id valido");
            
            conectarBase();
            
            String sql = "SELECT materia.idMateria, materia.nombre, materia.anio, materia.estado" +
                "FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria)" +
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
            desconectarBase();
        }catch(Exception ex){
            desconectarBase();
            throw ex;
        }
        return lista;
    }
    
    public ArrayList<Materia> obtenerMateriasNOCursadas(Integer id) throws Exception{
        ArrayList<Materia> lista = new ArrayList();
        try{
            if(id == null)
                JOptionPane.showMessageDialog(null, "Ingrese un id valido");
            
            conectarBase();
            
            String sql = "SELECT materia.idMateria, materia.nombre, materia.anio, materia.estado" +
                "FROM inscripcion JOIN materia ON (inscripcion.idMateria = materia.idMateria)" +
                "WHERE idAlumno != " + id;
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
            desconectarBase();
        }catch(Exception ex){
            desconectarBase();
            throw ex;
        }
        return lista;
    }
    
    public void borrarInscripcionAlumnoMateria(Integer idAlumno, Integer idMateria) throws Exception{
        try{
            if(idAlumno == null || idMateria == null)
                JOptionPane.showMessageDialog(null, "Ingrese id's validos");
            
            conectarBase();
            String sql = "DELETE FROM inscripcion" +
                "WHERE idAlumno = ? AND idMateria = ?";
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, idAlumno);
            sentencia.setInt(2, idMateria);
            int i = sentencia.executeUpdate();
            
            if(i != 1)
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada de forma exitosa");
            else
                JOptionPane.showMessageDialog(null, "Error al eliminar la inscripcion");
            
            desconectarBase();
        }catch(Exception ex){
            desconectarBase();
            throw ex;
        }
    }
}
