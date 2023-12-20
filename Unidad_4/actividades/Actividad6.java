import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        // variables
        double numeroA;
        double numeroB;

        // pedir valores
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        numeroA = lector.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        numeroB= lector.nextDouble();

        System.out.println("La media armonica es: " + mediaArmonica(numeroA, numeroB));

    }

    // metodo
    public static double mediaArmonica(double numeroA, double numeroB) {
        double suma = 0;
        if (numeroA != 0 && numeroB != 0) {
            suma = 2 / (1 / numeroA + 1 / numeroB);
        }
        return suma;
    }
}
