import java.util.Scanner;

public class Actividad16 {

    public static void main(String[] args) {
        //Variables
        String nombre;
        String primerApellido;
        String segundoApellido;

        Scanner lector = new Scanner(System.in);
        System.out.print("Indica tu nombre: ");
        nombre = lector.next();

        System.out.print("Indica tu primer apellidos: ");
        primerApellido = lector.next();

        System.out.print("Indica tu segundo apellido: ");
        segundoApellido = lector.next();


        String nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;

        System.out.println("minusculas: " + nombreCompleto.toLowerCase());
        System.out.println("MAYUSCULAS: " + nombreCompleto.toUpperCase());
        System.out.println("Longitud del nombre: " + nombreCompleto.length());

        if(nombreCompleto.length() > 2) {
            System.out.println("Primeros caracteres: " + nombreCompleto.substring(0,2));
        }

        if(nombreCompleto.length() > 2) {
            System.out.println("ultimos caracteres: " + nombreCompleto.substring(nombreCompleto.length()-3,nombreCompleto.length()-1));
        }


        // Funcion para ver las ocurrencias del ultimo caracter
        int contadorOcurrenciasCaracter = 0;
        char ultimoCaracter = nombreCompleto.charAt(nombreCompleto.length()-1);

        for (int i = 0; i < nombreCompleto.length(); i++) {
            if(nombreCompleto.charAt(i) == ultimoCaracter) {
                contadorOcurrenciasCaracter ++;
            }
        }

        System.out.println("El numero de ocurrencias del caracter " + ultimoCaracter + "es: " + contadorOcurrenciasCaracter);

        char primerCaracter = nombreCompleto.charAt(0);

        for (int i = 0; i < nombreCompleto.length(); i++) {
            if(nombreCompleto.charAt(i) == primerCaracter) {
                contadorOcurrenciasCaracter ++;
            }
        }

        System.out.println("El numero de ocurrencias del caracter " + primerCaracter + "es: " + contadorOcurrenciasCaracter);

        String primerTramoCadena = nombreCompleto.substring(0, 3);
        String segundoTramoCadena = nombreCompleto.substring(nombreCompleto.length()-3, nombreCompleto.length()-1);

        String resultado = "*" + nombreCompleto.substring(3);
        System.out.println(resultado);

        resultado = resultado.substring(0, resultado.length() - 3) + "*";
        System.out.println(resultado);

        System.out.print("Cadena invertida: ");
        for (int i = nombreCompleto.length(); i <= 0; i--) {
            System.out.print(nombreCompleto.charAt(i));
        }

        lector.close();

    }
}