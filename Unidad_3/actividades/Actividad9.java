
public class Actividad9 {
public static void main(String[] args) {
		
		//variables 
		int contador_numeros_impar = 0;
		int contador_numeros_pares = 0;
		int contador_numeros_cuatro = 0;
		int contador_numeros_siete = 0;
		
		int suma_numeros_pares = 0;
		int suma_numeros_impar = 0;
		int suma_numeros_cuatroysiete = 0;
		
		//condicion 
		for(int i = 1; i <= 100; i++) {

			System.out.print(i + " ");
			
			if (i%2 ==1) {
				contador_numeros_impar ++;
				suma_numeros_impar += i;
				
			}
		}
		
		
		System.out.println();
		
		System.out.println("Hay " + contador_numeros_impar + " numeros impares" );
		System.out.println("La suma de los numeros impares es: " + suma_numeros_impar);
		
		
		for(int i = 1; i <= 100; i++) {	
			if (i%2 == 0) {
				contador_numeros_pares ++;
				suma_numeros_pares += i;
			}
		}
		
		System.out.println();
		System.out.println("Hay " + contador_numeros_pares + " numeros pares");
		System.out.println("La suma de los numeros pares es: " + suma_numeros_pares);
		
		for(int i = 1; i <= 100 ;i++) {
			
			if (i%4 == 0) {
				contador_numeros_cuatro ++;
				suma_numeros_cuatroysiete += i;
			}
			
			if (i%7 == 0) {
				contador_numeros_siete ++;
				suma_numeros_cuatroysiete += i;
			}
			
		}
		
		System.out.println();
		System.out.println("Hay " + contador_numeros_cuatro + " numeros multiplo de cuatro");
		System.out.println("Hay " + contador_numeros_siete + " numeros multiplo de siete");
		
		System.out.println("La suma de los numeros multiplos de cuatro y siete es: " + suma_numeros_cuatroysiete);
		
	}
}
