import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {

        //Variables
        int numero;
        int funcionX;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero= lector.nextInt();

        if (numero == 0) {
            funcionX = 0;
        } else if (numero == 1) {
            funcionX = 1;
        } else if (numero == 2) {
            funcionX = 2;
        } else {
            int n_3 = numero - 3;
            int n_2 = numero - 2;
            int n_1 = numero - 1;

            funcionX = funcionX(n_3) + 2 * funcionX(n_2) + funcionX(n_1);
        }

        System.out.println("El valor de la función X para n = " + numero + " es: " + funcionX);
    }

    public static int funcionX(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int n_3 = n - 3;
            int n_2 = n - 2;
            int n_1 = n - 1;

            return funcionX(n_3) + 2 * funcionX(n_2) + funcionX(n_1);
        }
    }
}