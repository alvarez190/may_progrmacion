import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        // Variables
        char caracter;
        int lineas = 0;

        // Pedir  valores
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime el caracter: ");
        caracter=lector.next().charAt(0);

        System.out.print("Dime el numero de lineas: ");
        lineas=lector.nextInt();

    }

    static void triangulo(char caracter, int lineas) {
        for (int linea = 0; linea < lineas; linea++) {
            int veces = lineas * 2-1;
            for (int espacio = 0; espacio < veces; espacio++) {
                System.out.println("");
            }
        }
    }
}
