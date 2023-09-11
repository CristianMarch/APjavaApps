/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadproject.AccesoADatos;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadproject.Entidades.Materia;
/**
 *
 * @author Leo Huari
 */
public class MateriaData extends Conexion {
    
    public void guardarMateria(Materia materia){
        try{
            conectarBase();
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }
        String sql = "INSERT INTO materia (nombre, anio, estado) VALUES (?, ?, ?)";
        try{
            sentencia = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            sentencia.setString(1, materia.getNombre());
            sentencia.setInt(2, materia.getAnioMateria());
            sentencia.setBoolean(3, materia.isActivo());
            sentencia.executeUpdate();
            resultado = sentencia.getGeneratedKeys();
            if(resultado.next()){
                materia.setIdMateria(resultado.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia añadida con éxito.");

            }
            try{
                desconectarBase();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());

        }
    }
    
    public Materia buscarMateria(int id){
        String sql = "SELECT nombre, anio FROM materia WHERE idMateria = ? AND estado = 1";
        Materia materia = null;
        try{
            conectarBase();
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            resultado = sentencia.executeQuery();
            if(resultado.next()){
                materia = new Materia();
                materia.setIdMateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre"));
                materia.setAnioMateria(resultado.getInt("anio"));
                materia.setActivo(true);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Materia borrada con éxito");

        }

        return null;
    }
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ? anio = ?" + "WHERE idMateria = ? ";
        try{
            conectarBase();
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }

        try {
            sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, materia.getNombre());
            sentencia.setInt(2, materia.getAnioMateria());
            sentencia.setInt(3, materia.getIdMateria());
            int exito = sentencia.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Materia Modificada");
            }
            
            try{
                desconectarBase();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }

    }
    
    public void eliminarMateria(int id){
        String sql = "Update materia Set estado = 0 WHERE idMateria = ?";
        try{
            conectarBase();
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }

        try{
            sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, id);
            int exito = sentencia.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Materia borrada con éxito");
            }
            try{
                desconectarBase();
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }
    
    public ArrayList<Materia> listarMaterias(){
        ArrayList<Materia> lista = new ArrayList();
        try{
            conectarBase();
            String sql = "SELECT * FROM materia";
            sentencia = conexion.prepareStatement(sql);
            resultado = sentencia.executeQuery();
            Materia materia;
            while(resultado.next()){
                materia = new Materia();
                materia.setIdMateria(resultado.getInt(1));
                materia.setNombre(resultado.getString(2));
                materia.setAnioMateria(resultado.getInt(3));
                lista.add(materia);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null , "Problema al conectar a la base");
        }
        return lista;
    }
}
