package Unidad_6.actividad6;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        System.out.println("///////////// BIENVENIDO ///////////////");
        System.out.println("=================MENU================");
        
        Pizza pizza = new Pizza();
        
        int masa =  tipoMasa(lector);
        int[] ingredientes = listaIngredientes(lector);
        
        pizza.setMasa(masa);
        pizza.setIngredientes(ingredientes);

        System.out.println("El precio de la pizza es " + pizza.precio());
    }
    
    public static int tipoMasa(Scanner lector) {


        System.out.println("Indica el tipo de masa deseas en la pizza:\n" 
                            + "1) Masa Fina \n"
                            + "2) Masa Gruesa \n"
                            + "3) Masa Gruesa con borde relleno de queso \n");
        int idMasa = lector.nextInt();
        lector.close();

        return idMasa;
    }

    public static int[] listaIngredientes(Scanner lector) {
        int[] arrayIngrediente  = new int[5];

        for (int i = 0; i < arrayIngrediente.length; i++) {

            System.out.println("Indica el " + i + "º ingrediente: \n" 
                                + "(Maximo 5 ingredientes) \n"
                                + "1) Tomate \n"
                                + "2) Mozzarela \n"
                                + "3) Queso Azu\n"
                                + "4) Jamon\n"
                                + "5) Chedar \n"
                                + "6) Terminar pedido");
            
            int idIngrediente = lector.nextInt();
            
            if(idIngrediente == 6) {
                break;
            }else {
                arrayIngrediente[i] = idIngrediente;
            }
        }
        
        lector.close();

        return arrayIngrediente;
    }

}
