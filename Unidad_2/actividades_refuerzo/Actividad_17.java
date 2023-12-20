package actividades_refuerzo;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Actividad_17 {
    public static void main(String[] args) {
        // Variables
        String hora;

        // Inicializamos la variable Scanner para obtener los datos por teclado
        Scanner lector = new Scanner(System.in);  
        System.out.println("Dime una hora en formato (HH:mm:ss) => ");
        hora = lector.next();

        // Variable donde toma fecha y hora de hoy
        SimpleDateFormat hoy = new SimpleDateFormat("HH:mm:ss");

        System.out.println(hoy.toString());
        // Ralizamos el cambio de hora indicada

        // Añadimos 10 segundos a la de entrada
        

        lector.close();

    }   
}
