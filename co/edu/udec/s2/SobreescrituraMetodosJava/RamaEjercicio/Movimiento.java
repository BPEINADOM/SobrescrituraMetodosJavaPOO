package RamaEjercicio;

import RamaEjercicio.Domain.Model.Bicicleta;
import RamaEjercicio.Domain.Model.Vehiculo;

public class Movimiento {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();

        vehiculo.moverse();
        bicicleta.moverse();

        System.out.println("*********************************************");

    }
}
