import java.util.Scanner;
public class Actividad13 {
	public static void main (String[] args) {
		//variables
		int num;
		
		//pedir valores
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Diga un numero entero positivo ");
		num=lector.nextInt();
		
		//bucle
		System.out.print(num + " = ");
		
		while(true) {
			int divisor = 2;
			
			if(num%divisor == 0) {

				System.out.print(divisor + " * ");
				
				num = num/divisor;
			}else  {
				divisor ++;
			}
			
			if(num == 1) {
				break;
			}
			
		}
		
	}

}
