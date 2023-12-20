package Unidad_6;

public class Actividad_3 {
    public static void main(String[] args) {
        // Variables
        int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        // Muestro los numeros de  4 en 4
        System.out.print("[");
        for (int i = 3; i < numeros.length; i+=4) {
            System.out.print(numeros[i] + " ");
        }
        System.out.print("]");
        
    }
}