import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] args) {
        // Variables
        int calificacion;

        // Inicializamos la variable Scanner para recoger los datos del teclado
        Scanner lector = new Scanner(System.in);

        System.out.print("Dime la calificacion: ");
        calificacion = lector.nextInt();

        // Comparamos la calificacion con un switch case para sacar la calificacion alfabetica
        if(calificacion == 0 || calificacion < 3) {
            System.out.println("La calificacion es Muy Deficiente");
        }else if (calificacion < 5) {
            System.out.println("La calificacion es Insuficiente");
        }else if (calificacion < 6) {
            System.out.println("La calificación es Bien");
        }else if (calificacion < 9) {
            System.out.println("La calificación es Notable");
        }else if (calificacion <= 10) {
            System.out.println("La calificación es Sobresaliente");
        }

        lector.close();
    }
}