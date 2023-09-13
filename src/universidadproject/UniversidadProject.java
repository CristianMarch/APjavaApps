
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
        Alumno alumno = new Alumno (1, 778, "Cruz", "Leon", LocalDate.of(1992, Month.JANUARY, 20), true);
        
        AlumnoData data = new AlumnoData();
        System.out.println(data.listarAlumnos());
    }
    
}
