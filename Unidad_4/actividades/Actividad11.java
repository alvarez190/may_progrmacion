import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {

        //Variables
        String dni;

        // Pedir datos       
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu DNI (sin letra): ");
        dni = lector.nextLine();
        String letra = "";

        // Convertir DNI a entero
        int dniEnteros = Integer.parseInt(dni);

        // Calcular letra del DNI
        letra = calcularLetraDNI(dniEnteros);

        System.out.println("El NIF completo es: " + dni + letra);
    }

    private static String calcularLetraDNI(int dni) {
        String letra = "";
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        letra = letras[dni % 23];

        return letra;
    }
}