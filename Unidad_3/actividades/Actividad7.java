
public class Actividad7 {
	public static void main(String[] args) {
		
		//variables 
		int contador_numeros_impar = 0;
		int contador_numeros_pares = 0;
		int contador_numeros_cinco = 0;
		
		int suma_numeros_pares = 0;
		int suma_numeros_impar = 0;
		int suma_numeros_cinco = 0;
		
		//condicion 
		for(int i = 1; i < 99; i++) {
			
			if (i%2 ==1) {
				contador_numeros_impar ++;
				suma_numeros_impar += i;
				
				System.out.print(i + " ");
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("Hay " + contador_numeros_impar + " numeros impares" );
		System.out.println("La suma de los numeros impares es: " + suma_numeros_impar);
		
		
		for(int i = 1; i < 99; i++) {	
			if (i%2 == 0) {
				contador_numeros_pares ++;
				suma_numeros_pares += i;
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println("Hay " + contador_numeros_pares + " numeros pares");
		System.out.println("La suma de los numeros pares es: " + suma_numeros_pares);
		
		
		for(int i = 1; i < 99; i++) {
			
			if (i%5 == 0) {
				contador_numeros_cinco ++;
				suma_numeros_cinco += i;
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println("Hay " + contador_numeros_cinco + " numeros multiplo de cinco");
		System.out.println("La suma de los numeros multiplos de cinco es: " + suma_numeros_cinco);
		
		
	}
}
