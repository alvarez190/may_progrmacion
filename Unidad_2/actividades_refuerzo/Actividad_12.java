package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_12 {
    public static void main(String[] args) {
        // Variables
        int numero;

        // Inicialización de la variable Scanner para la toma de datos por teclado
        Scanner lector = new Scanner(System.in);

        System.out.print("Indica cualquier numero para saber si es positivo o negativo: ");
        numero = lector.nextInt();

        if(numero >=  0) {
            System.out.println("El numero " + numero + " es positivo");
        }else {
            System.out.println("El numero " + numero + " es negativo");
        }

        lector.close();
    }
}
