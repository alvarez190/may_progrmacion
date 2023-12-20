	import java. util.Scanner;
public class Actividad3 {
	public static void main (String[] args)  {
		
		//defino las variables
		int cuota_general =  500;
		int edad;
		String nombre;
		String padres_socios;
		
		//pedir valores
		Scanner lector=new Scanner (System.in);
		
	    System.out.print("Hola. Diga su nombre ");
		nombre = lector.next();
		
	    System.out.print("Diga su edad para conocer su cuota ");
	    edad = lector.nextInt();
	    
	    System.out.print ("Diga si sus padres son socios o no (Si/No) ");
	    padres_socios = lector.next();
	    
	    // Calculo
	    if (edad >= 65) {
	    	cuota_general = cuota_general / 2;
	    	System.out.print(nombre + ", has de pagar " + cuota_general + " euros");
	    	
	    }else if (edad < 18 && padres_socios.equals("Si")){
	    	cuota_general = cuota_general - (cuota_general*35/100);
	    	System.out.print(nombre + ", has de pagar "+ cuota_general + " euros");
	    	
	    }else if (edad < 18 && padres_socios.equals("No")){
	    	cuota_general =  cuota_general - (cuota_general*25/100);
	    	System.out.print(nombre + ", has de pagar "+ cuota_general + " euros");
	    
	    }else {
	    	System.out.print(edad);
	    }	    
	    
	    lector.close();
	}

}
