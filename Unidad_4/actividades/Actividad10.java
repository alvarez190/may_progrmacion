import java.util.Scanner;
public class Actividad10 {
    public static void main(String[] args) {
        //variables
        String palabra1;
        String palabra2;
        String palabra3;
        

        //pedir datos
        Scanner lector = new Scanner(System.in);
        System.out.print("Diga la primera palabra: ");
        palabra1=lector.next();

        System.out.print("Diga la segunda palabra: ");
        palabra2=lector.next();

        System.out.print("Diga la tercera palabra: ");
        palabra3=lector.next();

        int opcion=1;
        while (opcion !=0){

        System.out.print
        ("MENÚ PRINCIPAL\n"+
        "==============\n"+
        "1.-Palabra más larga.\n"+
        "2.-Palabra más corta.\n"+
        "3.-Número de vocales de las palabras.\n"+
        "0.-Salir\n"+
        "Elige una opción:"); 
        
        opcion = lector.nextInt();

        if(opcion==1){
            palabraLarga(palabra1, palabra2, palabra3);
        }else if(opcion==2){
            palabraCorta(palabra1,palabra2,palabra3);
        }else if(opcion==3){
            vocales(palabra1, palabra2, palabra3);
        }

     }

        
    }

    static void palabraLarga(String palabra1, String palabra2, String palabra3) {
        if(palabra1.length() > palabra2.length() && palabra1.length() > palabra3.length()) {
            System.out.println("La palabra más larga és: " + palabra1);
        }else if(palabra2.length() > palabra1.length() && palabra2.length() > palabra3.length()) {
            System.out.println("La palabra más larga és: " + palabra2);
        }else {
            System.out.println("La palabra más larga és: " + palabra3);
        }
    }
    
    static void palabraCorta(String palabra1, String palabra2, String palabra3) {
        if(palabra1.length() < palabra2.length() && palabra1.length() < palabra3.length()) {
            System.out.println("La palabra más corta és: " + palabra1);
        }else if(palabra2.length() < palabra1.length() && palabra2.length() < palabra3.length()) {
            System.out.println("La palabra más corta és: " + palabra2);
        }else {
            System.out.println("La palabra más corta és: " + palabra3);
        }
    }

    static void vocales(String palabra1, String palabra2, String palabra3) {
        int totalVocalesPalabra1 = 0;
        int totalVocalesPalabra2 = 0;
        int totalVocalesPalabra3 = 0;

        for (int posicionCaracter = 0; posicionCaracter < palabra1.length(); posicionCaracter++) {
            int caracter = palabra1.charAt(posicionCaracter);
            switch (caracter) {
                case 'a':
                    totalVocalesPalabra1 ++;
                    break;
                case 'e':
                    totalVocalesPalabra1 ++;
                    break;
                case 'i':
                    totalVocalesPalabra1 ++;
                    break;
                case 'o':
                    totalVocalesPalabra1 ++;
                    break;
                case 'u':
                    totalVocalesPalabra1 ++;
                    break;
            
                default:
                    break;
            }
        }

        for (int posicionCaracter = 0; posicionCaracter < palabra2.length(); posicionCaracter++) {
            int caracter = palabra1.charAt(posicionCaracter);
            switch (caracter) {
                case 'a':
                    totalVocalesPalabra2 ++;
                    break;
                case 'e':
                    totalVocalesPalabra2 ++;
                    break;
                case 'i':
                    totalVocalesPalabra2 ++;
                    break;
                case 'o':
                    totalVocalesPalabra2 ++;
                    break;
                case 'u':
                    totalVocalesPalabra2 ++;
                    break;
            
                default:
                    break;
            }
        }

        for (int posicionCaracter = 0; posicionCaracter < palabra3.length(); posicionCaracter++) {
            int caracter = palabra1.charAt(posicionCaracter);
            switch (caracter) {
                case 'a':
                    totalVocalesPalabra3 ++;
                    break;
                case 'e':
                    totalVocalesPalabra3 ++;
                    break;
                case 'i':
                    totalVocalesPalabra3 ++;
                    break;
                case 'o':
                    totalVocalesPalabra3 ++;
                    break;
                case 'u':
                    totalVocalesPalabra3 ++;
                    break;
            
                default:
                    break;
            }
        }

        System.out.println("El numero de vocales de la palabra1 es: " + totalVocalesPalabra1);
        System.out.println("El numero de vocales de la palabra2 es: " + totalVocalesPalabra2);
        System.out.println("El numero de vocales de la palabra3 es: " + totalVocalesPalabra3);
    }
}
