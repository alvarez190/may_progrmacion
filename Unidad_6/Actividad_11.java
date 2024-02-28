import java. util. Scanner;
public class Actividad11{
    public static void main ( String[]args) {
        //defino varaiables 
        String cadena = "";
        Scanner lector = new Scanner (System.in);

        //leer cadena 
        System. out.println ("Introduce la cadena");
        cadena = lector.nextLine();

        //procesar cadena 
        cadena = cadena.replaceAll ("[0-9]{2,}", "").replaceAll ("

        //imprimo la cadena 


    }
}