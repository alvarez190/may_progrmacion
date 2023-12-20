import java.util.Scanner;
public class Actividad12 {
	public static void main (String [] args) {
		//variables 
		int num1;
		boolean esPrimo = true;
		
		//pedir valores 
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Diga un numero entero ");
		num1=lector.nextInt();
		
		//bucle
		for(int i = 2; i < num1; i++) {
			if(num1%i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		if(esPrimo) {
			System.out.print("Es primo");
		}else {
			System.out.print("No es primo");
		}
	}

}
