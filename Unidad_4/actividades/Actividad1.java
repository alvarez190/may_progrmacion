import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        // variables
        int a;
        int b;
        int c;

        // Pedir valores
        System.out.print("Diga un numero a");

        Scanner lector = new Scanner(System.in);
        a = lector.nextInt();

        System.out.print("Diga un numero b");
        b = lector.nextInt();

        System.out.print("Diga un numero c");
        c = lector.nextInt();

        int mayor = mayor(a,b,c);
        System.out.println("El numero del mayor de los tres es: "+mayor);
    }

    // metodo
    static int mayor(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }else if (b >= c && b >=c) {
            return b;
        }else {
            return c;
        }
    }

}