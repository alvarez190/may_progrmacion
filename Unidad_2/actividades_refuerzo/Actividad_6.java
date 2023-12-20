package actividades_refuerzo;

import java.util.Scanner;

public class Actividad_6 {
    public static void main(String[] args) {
        // Variables
        double precioArticulo;
        double precioVentaArticulo;
        double descuento;

        // Inicializo la variable Scanner para recoger los datos por teclado
        Scanner lector = new Scanner(System.in);

        System.out.println("Indica el precio del Ariculo: ");
        precioArticulo = lector.nextDouble();
        System.out.println("Indica el precio de venta del Articulo: ");
        precioVentaArticulo = lector.nextDouble();
    
        // Realizmos el calculo        
        // Si el precio de venta es menor al precio del ariculo habra un descuento
        if(precioVentaArticulo < precioArticulo) {
            double resto = precioArticulo - precioVentaArticulo;
            descuento = Math.round((resto / precioArticulo)  * 100);
            System.out.println("El descuento entre estos precios es de " + descuento + "%"); 
        }else {
            System.out.println("No hay ningun descuento entre estos precios.");
        }

        lector.close();
    }
}
