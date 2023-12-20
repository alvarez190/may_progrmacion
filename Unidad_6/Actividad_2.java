package Unidad_6;

class Actividad_2 {
    public static void main(String[] args) {
        // Variables 
        int numeros[] = {1, 2, 3, 4,5,6,7,8,9,10};
        
        System.out.print("Datos que ocupen un posicion par => [");
        for (int i = 1; i < numeros.length; i+=2) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");

        System.out.print("Datos que ocupen un posicion impar => [");
        for (int i = 2; i < numeros.length; i+=2) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("]");
    }   
}