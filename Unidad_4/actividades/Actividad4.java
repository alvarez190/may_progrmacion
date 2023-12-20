import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        //Variables
        String caracter;
        int lineas = 0;
        int veces = 0;

        // Pedir valores
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime el caracter que se va repetir: ");
        caracter = lector.next();

        System.out.print("Diga la veces que se va repetir: ");
        veces = lector.nextInt();

        System.out.print("Diga las lineas que se va repetir: ");
        lineas = lector.nextInt();

        repetir(caracter, lineas, veces);
    }

    static void repetir(String caracter, int lineas, int veces) {
        for (int linea = 0; linea < lineas; linea++) {
            for (int vez = 0; vez < veces; vez++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
}
