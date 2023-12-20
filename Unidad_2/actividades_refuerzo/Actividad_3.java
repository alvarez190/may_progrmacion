package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_3 {
    public static void main(String[] args) {
        // Variables
        int ladoCuadrado;
        int area;

        // Inicializo la variable Scanner para recoger el dato por teclado
        Scanner lector = new Scanner(System.in);

        System.out.print("Indica el lado del cuadrado que deseas saber su area: ");
        ladoCuadrado = lector.nextInt();

        // Realizamos el calculo

        area = ladoCuadrado * ladoCuadrado;

        // Muestro el resultado
        System.out.println("El area del cuadrado de lado " + ladoCuadrado + " es " + area);
        
        lector.close();
    }
}
