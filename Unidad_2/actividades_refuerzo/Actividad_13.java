package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_13 {
    public static void main(String[] args) {
        // Variables
        int numero1;
        int numero2;

        // Inicializamos la variable Scanner para tomar los datos por teclado
        Scanner lector = new Scanner(System.in);

        System.out.print("Dime el primer numero: ");
        numero1 = lector.nextInt();
        System.out.print("Dime el segundo numero: ");
        numero2 = lector.nextInt();

        // Realizamos el orden de los numeros
        System.out.println("El orden de los numeros indicados son los siguientes:");
        if(numero1 > numero2) {
            System.out.println("Numero 1  => " + numero1 + "\n" + "Numero 2 => " + numero2);
        }else {
            System.out.println("Numero 2 => " + numero2 + "\n" + "Numero 1  => " + numero1);
        }

        lector.close();
    }
}
