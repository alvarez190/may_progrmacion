public class Actividad17 {
    public static void main(String[] args) {
        // variables
        String cadena = "Maylen";
        System.out.println("Antes:" + cadena);

        System.out.println("Despues:"+replace(cadena));

    }
    // metodo string
    /// bucle > switch (palabra) --> a e i o u - replace de 'a'
static String replace(String cadena) {
    for (int i = 0; i < cadena.length(); i++) {
        switch (cadena.charAt(i)){
            case 'a':
                cadena = cadena.replace('a', 'a');
                break;
            case 'e':
                cadena = cadena.replace('e', 'a');
                break;
            case 'i':
                cadena = cadena.replace('i', 'a');
                break;
            case 'o':
                cadena = cadena.replace('o', 'a');
                break;
            case 'u':
                cadena = cadena.replace('u', 'a');
                break;
        }
    }
    return cadena;
}

}