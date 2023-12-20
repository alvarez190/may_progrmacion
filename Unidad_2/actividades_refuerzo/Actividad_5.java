package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_5 {
    public static void main(String[] args) {
        // Variables
        double radio;
        double longitud;
        double area;
        double volumen;

        Scanner lector = new Scanner(System.in);

        System.out.println("Dime el valor radio: ");
        radio = lector.nextInt();

        // Realizao las operaciones 

        area = Math.PI * Math.pow(radio,2);
        longitud = (2*Math.PI)*radio+radio;
        volumen = 4/3*Math.PI*Math.pow(radio, 3);

        System.out.println("La longitud de un circunferencia es " + longitud);
        System.out.println("El volumen de la esfera es " + volumen);

    }
}
