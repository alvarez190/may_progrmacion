import java.util.Scanner;

public class Actividad15 {

    public static void main(String[] args) {
        //Variables
        int m;
        int n;

        Scanner lector = new Scanner(System.in);
        System.out.println("Dame numero m: ");
        m = lector.nextInt();

        System.out.println("Dame numero n: ");
        n = lector.nextInt();
        
        // Formula m!/(n!*(m-n))

        double resultado = numeroFactorial(m)/(numeroFactorial(n)*(numeroFactorial(m) - numeroFactorial(n)));

        System.out.println("El resultado de la formula de m!/(n!*(m-n)) es: " + resultado);

        lector.close();

    }

    // metodo
    public static int numeroFactorial(int numero) {
        int factorial = 1;
        for (int i = numero; i > 0; i--){
            factorial *=i;
        }
        return factorial;
    }
}