import java.util.Scanner;
public class Actividad6 {
    public static void main (String[] args) {
        //defino varaiables
        int numeroA;
        int numeroB;
        int auxiliar;

        //pedir valores de los numeros
        Scanner scanner = new Scanner   (System.in);
        System.out.print ("Escribe un numeroA => ");
        numeroA = scanner.nextInt();
        System.out.print ("Escribe un numeroB => ");
        numeroB = scanner.nextInt();
        scanner.close();
        System.out.println ("A = "+ numeroA + ", B = "+ numeroB);

        //intercambiar varaiables 
        auxiliar=numeroA;
        numeroA=numeroB;
        numeroB=auxiliar;

        //ver los cambios 
        System.out.println ("A = "+ numeroA + ", B = "+ numeroB);
    }
}
