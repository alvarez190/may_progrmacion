import java.util.Scanner;

public class Actividad3 {
    public static void main (String[]args){
        //variables
        String caracter;
        int veces;

        //pedir valores
        Scanner lector = new Scanner (System.in);
        System.out.print("Diga el caracter que desea ");
        caracter = lector.next();

        System.out.print("Diga las veces que se repite el caracter ");
         veces = lector.nextInt();
        
        lector.close();

        argumentos(caracter,veces);
    }

    // metodo
    static void argumentos(String caracter, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(caracter);
        }

    }
}

    
