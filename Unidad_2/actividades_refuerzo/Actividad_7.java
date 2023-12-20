package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_7 {
    public static void main(String[] args) {
        // Variables
        int millas;
        int metros;

        // Inicializo la variable Scanner para recoger los datos por teclado
        Scanner lector = new Scanner(System.in);

        System.out.println("Dime la distancia en milla para hacer la conversion a metros: ");
        millas = lector.nextInt();

        // Hacemos la conversion

        metros = millas * 1852;

        System.out.println("La distancia en metros es de "+ metros + "m");

        lector.close();
    }
}
