import java.util.Scanner;
public class Actividad11 {
	public static void main(String[] args) {
		//variables 
		int a; 
		int b;
		int total = 1;
		
		//pedir valores 
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Diga un numero a");
		a=lector.nextInt();
		System.out.println("Diga la potencia del numero a");
		b=lector.nextInt();
		
		//bucle
		for(int i = 0; i < b; i++) {
			
			total *=a;
		}
		
		System.out.println("El resultado de la potencia es " + total);
	}
}
