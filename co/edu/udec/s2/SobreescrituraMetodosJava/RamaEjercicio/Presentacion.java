package RamaEjercicio;

import RamaEjercicio.Domain.Model.Estudiante;
import RamaEjercicio.Domain.Model.Persona;
import RamaEjercicio.Domain.Model.Profesor;

public class Presentacion {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        System.out.println("*********************************************");

    }
    
}
