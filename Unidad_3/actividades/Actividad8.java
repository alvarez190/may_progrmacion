import java.util.Scanner;
public class Actividad8 {
	public static void main(String[] args) {
		//variables
		int numeroA;
		int numeroB;
		int pares;
		
		//Pedir valores
		Scanner lector = new Scanner (System.in);
		System.out.print("Diga un numeroA ");
		numeroA=lector.nextInt();
		
		System.out.print("Diga un numeroB cuyo valor sea menor que nuemorA ");
		numeroB=lector.nextInt();
				

		//condicion
		if (numeroA>numeroB) {
			for (int i=numeroB; i<=numeroA; i++) {
				double pares1 = i/2;
				
				if (i%2 == 0) {
					System.out.print(i+" " );
				}
		
		} 
		lector.close();
	}

}
}