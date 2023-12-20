package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_8 {
    public static void main(String[] args) {
        // Variables
        int edad;

        // Inicializo la variable Scanner para recoger los datos por teclado
        Scanner lector = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        edad = lector.nextInt();

        if(edad > 18) {
            System.out.println("Eres mayor de edad");
        }

        lector.close();
    }
}
