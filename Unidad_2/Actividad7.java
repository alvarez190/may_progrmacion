import java.util.Scanner;
public class Actividad7 {
    public static void main(String[] args)  {
        //defino variables
        double altura;
        double ancho;
        double area;
        double perimetro;

        //pedir los valores 
        Scanner lector = new Scanner   (System.in);
        System.out.print("Diga la altura del rectángulo => " );
        altura = lector.nextInt();
        System.out.print("Diga la ancho del rectángulo => " );
        ancho = lector.nextInt();

        //resultado 
        area = altura*ancho;
        System.out.println("area = " + area);

        perimetro = (altura*2) + (ancho*2);
        System.out.println("perimetro = " + perimetro);

        lector.close();

    }
    
}
