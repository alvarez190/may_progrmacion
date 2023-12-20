package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_11 {
    public static void main(String[] args) {
        // Variables 
        int numero1;
        int numero2;

        // Inicializo la variable scanner para tomar los datos por teclado
        Scanner lector = new Scanner(System.in);

        System.out.println("/// Numero Mayor ///");
        System.out.println("Dime el primer numero: ");
        numero1 = lector.nextInt();
        System.out.println("Dime el segundo numero: ");
        numero2 = lector.nextInt();

        // Comparamos los numeros y sacamos el numero mayor
        if(numero1 > numero2){
            System.out.println("El numero " + numero1 + " es mayor al numero " + numero2);
        }else {
            System.out.println("El numero " + numero2 + " es mayor al numero " + numero1);
        }

        lector.close();
        
    }
}
