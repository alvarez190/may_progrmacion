import java.util.Scanner;
public class Actividad15 {
	public static void main (String[]args) {
		
		//Variables 
		int num;
		boolean noadivinado = true; 
		int numeroAleatorio = (int) Math.random()*100+1;
		int contador = 0;
		
		//Pedir valores 
		Scanner lector= new Scanner(System.in);
		System.out.println("El ordenador ha pensado un número que debes intentar adivinar…");
		
		//Bucle
		while(noadivinado) {
			System.out.print("Inserta un numero: ");
			num=lector.nextInt();
			
			if(num > numeroAleatorio) {
				System.out.println("Te has pasado");
				contador++;
				
				
			}else if(num < numeroAleatorio) {
				System.out.println("No llegas");
				contador++;
				
				
			}else if(num == numeroAleatorio) {
				System.out.println("Has acertado !!!");
				System.out.println("Has necesitado " + contador + " intentos.");
				break;
			}
			
			
			
		}
		
		
		
	}
	

}
