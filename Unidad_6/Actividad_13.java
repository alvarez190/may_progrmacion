import java. util. Scanner;
public class Actividad13{
    public static void main ( String[]args) {
        //defino varaiables 
        String cadena = "";
        Scanner lector = new Scanner (System.in);

        //leer cadena 
        System. out.println ("Introduce el codigo postal");
        cadena = lector.nextLine();

        //comprobar si cumple la condicion 

        if (cadena.matches(cadena)) System.out.println ("EL CODIGO ES VALIDO");
        else System.out.println ("EL CODIGO NO ES VALIDO");
        {
            wile (!cadena.matches(cadena))
        }


        // ([0-4][0-9]) | (5[0-2][0-9]) {3}
