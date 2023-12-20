package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_15 {
    public static void main(String[] args) {
        // Variables
        int numero1;
        int numero2;
        int numero3;


        // Inicializamos la variable Scanner para obtener los datos del teclado
        Scanner lector = new Scanner(System.in);

        System.out.println("Indica el numero 1");
        numero1 = lector.nextInt();
        System.out.println("Indica el numero 2");
        numero2 = lector.nextInt();
        System.out.println("Indica el numero 3");
        numero3 = lector.nextInt();

        // Comparamos la variables para sacar el numero mayor
        if(numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero 1 es el  mayor de todos");
        }else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero 2 es el  mayor de todos");
        }else {
            System.out.println("El numero 3 es el mayor de todos");
        }
        lector.close();
    }
}
