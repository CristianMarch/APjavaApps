
package universidadproject;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import universidadproject.AccesoADatos.*;
import universidadproject.Entidades.*;


public class UniversidadProject {

    
    public static void main(String[] args) {
        //Alumno alumno = new Alumno (555, "Fernandez", "Fabiana", LocalDate.of(1980, Month.JUNE, 30), true);
        //Alumno alumno2 = new Alumno (666, "Victoria", "Fernando", LocalDate.of(2000, Month.FEBRUARY, 02), true);
        //Alumno alumno = new Alumno (1, 778, "Cruz", "Leon", LocalDate.of(1992, Month.JANUARY, 20), true);
        
        //AlumnoData data = new AlumnoData();
        //System.out.println(data.listarAlumnos());
        
//        Materia materia = new Materia("Biofisica", 1, true);
//        Materia materia2 = new Materia("Analisis de datos", 5, true);
//        Materia materia3 = new Materia("Electronica", 1, true);
        
        MateriaData data = new MateriaData();
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

        System.out.println(data.listarMaterias());
    }
    
}
