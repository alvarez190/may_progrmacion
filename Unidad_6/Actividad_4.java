package Unidad_6;
import java.util.Scanner;

public class Actividad_4 {
    public static void main(String[] args) {
        //Variables
        int [] numeros = new int[50];
        double suma = 0;

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dime el " + i + "º numero : ");
            int dato = lector.nextInt();
            numeros[i] = dato;
        }

        // Suma de elementos de posicion par
        for (int i = 0; i < numeros.length; i++) {
            if(i%2 == 0) {
                suma += numeros[i];
            }
        }

        System.out.println("La suma total de elementos de posicion par es: " + suma);
    }
}