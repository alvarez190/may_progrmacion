import java.util.Scanner;
public class Actividad9 {
    public static void main(String[] args) {
        //varaibles
        String nombre;
        String idioma;


        Scanner lector=new Scanner (System.in);
        System.out.print("Hola.Diga su nombre: ");
        nombre = lector.next();

        System.out.print("Hola.Diga su idioma de preferencia: ");
        idioma= lector.next();

        bienvenido(nombre, idioma);

    }

    //metodo
    static void bienvenido(String nombre, String idioma){
        switch(idioma){
            case "valenciano": System.out.println("Bon dia "+ nombre);
            break;

            case "castellano": System.out.println("Buenos dias "+ nombre);
            break;

            case "ingles": System.out.println("Good Morning "+ nombre);
            break;

            default: System.out.println("Error");
            break;
        }
    }
}
