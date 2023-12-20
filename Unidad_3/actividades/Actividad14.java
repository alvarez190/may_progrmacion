import java.util.Scanner;
import java.math.*;
public class Actividad14 {
	public static void main(String[] args) {
		
		// Variables
		int numero;
		int num_caras=0;
		int num_cruces=0;
		
		// Pedir datos
		Scanner lector = new Scanner(System.in);
	
		System.out.print("Dime el numero de veces que quieres lanzar la moneda");
		numero = lector.nextInt();
		
		//Calculo
		for(int i = 0; i<numero; i++ ) {
			 int numeroAleatorio = (int) (Math.random()*2+1);
			 
			if (numeroAleatorio==1) {
				num_caras++;
			}else {
				num_cruces++;
			}
			}
		
		//Calculo porciento 
		int porciento_caras = num_caras*100/numero;
		int porciento_cruces = num_cruces*100/numero;
	
		System.out.println("Numero de caras: "+ num_caras+"("+porciento_caras+"%)");
		System.out.println("Numero de cruces: "+ num_cruces+"("+porciento_cruces+"%)");
		
		
	}

}
