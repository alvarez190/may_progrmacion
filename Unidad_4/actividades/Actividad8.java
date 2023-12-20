import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        // Variables
        int numA = 1;
        int numB = 0;
        int numC = 0;
        int numD = 0;

        // Pedir datos
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        numA = lector.nextInt();

        System.out.print("Introduce el segundo número: ");
        numB = lector.nextInt();

        System.out.print("Introduce el tercer número: ");
        numC = lector.nextInt();

        System.out.print("Introduce el cuarto número: ");
        numD = lector.nextInt();

        capicua(numA);
        capicua(numB);
        capicua(numC);
        capicua(numD);
    }

    static void capicua(int numA) {
        double numeroInvertido = 1;
        int resto=0;

        while (numA != 0) {
            resto = numA % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            numA = numA / 10;
        }

        if (numeroInvertido == numA) {
            System.out.println("El número " + numA + " es capicua.");
        } else {
            System.out.println("El número " + numA + " no es capicua.");
        }
    }

}
