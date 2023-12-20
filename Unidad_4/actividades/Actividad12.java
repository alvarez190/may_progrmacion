import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        //Variables 
        String fecha_cumpleaños;

        //Pedir datos
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Dime la fecha de tu cumpleaños: ");
        fecha_cumpleaños = lector.next();

    }

    static void numeroDeLaSuerte(String fecha){
        String numeros = fecha.replace("-","");
        int suma = 0;

        for (int i = 0; i < numeros.length(); i++) {
            int numero = Integer.valueOf(numeros.charAt(i));
            suma += numero;
        }

        String sumaString = String.valueOf(suma); 
        int numeroSuerte = 0;

        for (int i = 0; i < sumaString.length(); i++) {
            numeroSuerte += Integer.valueOf(sumaString.charAt(i));
        }       

        System.out.println("Tu numero de la suerte es: " + numeroSuerte);
    }
}