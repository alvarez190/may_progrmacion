public class Actividad13 {
    public static void main(String[] args) {
        // Variables
        String caracteresEspeciales = "! “ # $ % & ' ( ) * + , - . / : ; - = > ? @ [ \\ ] ^ _ { | }";
        
        int contadorEspaciosBlancos = 0;

        for (int i = 0; i < caracteresEspeciales.length(); i++) {
            if(caracteresEspeciales.charAt(i) == ' ') {
                contadorEspaciosBlancos ++;
            }
        }
        System.out.println("Los espacios blancos: " + contadorEspaciosBlancos);

        contadorEspaciosBlancos = caracteresEspeciales.length() - contadorEspaciosBlancos;
        
        System.out.println("Los caracteres especiales: " + contadorEspaciosBlancos);
        System.out.println(caracteresEspeciales);



    }
}