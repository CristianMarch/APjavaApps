package universidadproject.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadproject.Entidades.Alumno;

/**
 *
 * @author Leo Huari
 */
public class AlumnoData extends Conexion {

    public void guardarAlumno(Alumno alumno) {
        try {
            conectarBase();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            sentencia = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            sentencia.setInt(1, alumno.getDni());
            sentencia.setString(2, alumno.getApellido());
            sentencia.setString(3, alumno.getNombre());
            sentencia.setDate(4, Date.valueOf(alumno.getFechaNac()));//localDate a Date
            sentencia.setBoolean(5, alumno.getEstado()); // if reducido
            sentencia.executeUpdate();
            resultado = sentencia.getGeneratedKeys();
            if (resultado.next()) {
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");

            }
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());

        }
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni= ? , apellido ? , nombre = ?, fechaNacimiento = ?"
                + "WHERE idAlumno= ? ";
        try {
            conectarBase();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }

        try {
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, alumno.getDni());
            sentencia.setString(2, alumno.getApellido());
            sentencia.setString(3, alumno.getNombre());
            sentencia.setDate(4, Date.valueOf(alumno.getFechaNac()));
            sentencia.setInt(5, alumno.getIdAlumno());
            int exito = sentencia.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno Modificado");
            }
            
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
        }

    }

    public void eliminarAlumno(int id) {
        String sql = "Update alumno Set estado = 0 WHERE idAlumno = ?";
        try {
            conectarBase();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }

        try {
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            int exito = sentencia.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno borrado con exito");
            }
            try {
                desconectarBase();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Alumno");
        }
    }

    public Alumno buscarAlumnoPorId(int id) {
        String sql = " SELECT dni, apellido, nombre, fechaNac FROM alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alumno = null;
        try {
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setApellido(resultado.getNString("apellido"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setDni(resultado.getInt("dni"));
                alumno.setEstado(true);
                alumno.setFechaNac(resultado.getDate("fechaNac").toLocalDate());
            }else{
             JOptionPane.showMessageDialog(null, "no existe el alumno");
               
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Alumno borrado con exito");

        }

        return alumno;
    }
    public Alumno buscarAlumnoPorDNI(int dni) {
        String sql = " SELECT idAlumno, dni, apellido, nombre, fechaNac FROM alumno WHERE dni = ? AND estado = 1";
        Alumno alumno = null;
        try {
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, dni);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                alumno.setApellido(resultado.getNString("apellido"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setDni(dni);
                alumno.setEstado(true);
                alumno.setFechaNac(resultado.getDate("fechaNac").toLocalDate());
            }else{
             JOptionPane.showMessageDialog(null, "no existe el alumno");
               
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Alumno borrado con exito");

        }

        return alumno;
    }
    public List listarAlumnos() {
        String sql = " SELECT idAlumno, dni, apellido, nombre, fechaNac FROM alumno WHERE estado = 1";
        ArrayList <Alumno> alumnos = new ArrayList<>();
        
        try {
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                alumno.setApellido(resultado.getNString("apellido"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setDni(resultado.getInt("dni"));
                alumno.setEstado(true);
                alumno.setFechaNac(resultado.getDate("fechaNac").toLocalDate());
                
                alumnos.add(alumno);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Alumno borrado con exito");

        }

        return alumnos;
    }
}
