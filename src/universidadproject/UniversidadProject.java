
package universidadproject;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import universidadproject.AccesoADatos.*;
import universidadproject.Entidades.*;


public class UniversidadProject {

    
    public static void main(String[] args) {
        //Alumno alumno = new Alumno (1234567, "Fernandez", "Fabiana", LocalDate.of(1980, Month.JUNE, 30), true);
        //Alumno alumno2 = new Alumno (666, "Victoria", "Fernando", LocalDate.of(2000, Month.FEBRUARY, 02), true);
        //Alumno alumno = new Alumno (1, 778, "Cruz", "Leon", LocalDate.of(1992, Month.JANUARY, 20), true);
        
        AlumnoData dataAlumno = new AlumnoData();
        //System.out.println(data.listarAlumnos());
        
//        Materia materia = new Materia("Biofisica", 1, true);
//        Materia materia2 = new Materia("Analisis de datos", 5, true);
//        Materia materia3 = new Materia("Electronica", 1, true);
        
        MateriaData dataMateria = new MateriaData();
//        data.guardarMateria(materia);
//        data.guardarMateria(materia2);
//        data.guardarMateria(materia3);
            
//        System.out.println(data.buscarMateria(10));
//        System.out.println(data.buscarMateria(5));
        
//        Materia materia = new Materia(4 , "Fisica", 3, true);
//        Materia materia2 = new Materia(10, "Sistemas Operativos", 5, true);
//        data.modificarMateria(materia);
//        data.modificarMateria(materia2);

//        data.eliminarMateria(8);
//        data.eliminarMateria(3);

//        System.out.println(data.listarMaterias());
//        Inscripcion inscrito = new Inscripcion(5 , dataAlumno.buscarAlumnoPorId(1), dataMateria.buscarMateria(9));
//        Inscripcion inscrito2 = new Inscripcion(8.5 , dataAlumno.buscarAlumnoPorId(4), dataMateria.buscarMateria(12));
        InscripcionData data = new InscripcionData();
        
//        data.guardarInscripcion(inscrito);
//        data.guardarInscripcion(inscrito2);
//        System.out.println(data.obtenerInscripciones());
        //System.out.println(dataAlumno.buscarAlumnoPorId(1));
//        System.out.println(data.obtenerInscripcionesPorAlumno(1));
//        System.out.println(data.obtenerMateriasCursadas(5));
//        System.out.println("------------------------------");
//        for(Materia m : data.obtenerMateriasNOCursadas(5)){
//            System.out.println(m);
//        }
         //data.borrarInscripcionAlumnoMateria(1, 2);
        //data.actualizarNota(5, 6, 4);
//        for(Alumno m : data.obtenerAlumnosPorMateria(6)){
//            System.out.println(m);
//        }
    }
    
}
