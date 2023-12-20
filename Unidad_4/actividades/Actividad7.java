import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        // Variables
        int numero;

        // Pedir datos
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numero = lector.nextInt();

        //Mostrar factorial
        System.out.println("El resultado del factorial de " + numero + "="+numeroFactorial(numero));
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
