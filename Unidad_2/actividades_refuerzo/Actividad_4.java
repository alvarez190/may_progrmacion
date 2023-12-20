package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_4 {
    public static void main(String[] args) {
        // Variables
        int numero1;
        int numero2;
        int suma;
        int resta;
        int producto;
        double division;

        // Inicializamos la variable Scanner para recoger los datos del teclado
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce el primer numero para las operaciones: ");
        numero1 = lector.nextInt();
        System.out.print("Introduce el segundo numero para las operaciones: ");
        numero2 = lector.nextInt();

        // Realizo las operaciones indicadas
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        producto = numero1 * numero2;
        division = numero1 / numero2;

        // Muestro los resultados
        System.out.println("Los resultados de las operaciones son las siguientes: ");
        System.out.println("Suma => " + suma);
        System.out.println("Resta => " + resta);
        System.out.println("Multiplicacion => " + producto);
        System.out.println("Division => " + division);

        lector.close();

    }
}
