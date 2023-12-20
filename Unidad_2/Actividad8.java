import java.until.scanner;
import java.util.Scanner;
public class Actividad8 {
    public static void main(String[] args) {
        double volumen;
        double area;
        double diametro;
        double altura;

        //Peedir los datos al usuario
        Scanner lector = new Scanner (System.in);
        System.out.print ("Diga la altura del cilindro");
        altura = lector.nextInt();
        System.out.print ("Diga el diametro del cilindro");
        diametro = lector.nextInt();

        //Calculos 
        radio=diametro/2;
        area=2PI*radio*2+2PI*radio*altura;

    

    }
    
}
