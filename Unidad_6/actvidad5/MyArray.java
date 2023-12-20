package Unidad_6.actvidad5;

public class MyArray {
    // Variables
    private int myArray[];

    // Constructor
    public MyArray(int[]array) {
        myArray = array;
    }

    // Metodo 1
    public void visualizarArray() {

        System.out.println("Todos los datos del array son => ");

        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("]");
    }

    // Metodo 2
    public void visualizarContPar() {
        System.out.println("Todos los datos de posicion par del array =>");

        System.out.print("[");
        for (int i = 1; i < myArray.length; i++) {
            if (i%2 == 0) {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println("]");
    }

    // Metodo 3
    public void visualizarContImpar() {
        System.out.println("Todos los datos de posicion impar del array =>");

        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            if (i%2 == 1) {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.print("]");
    }
    
}