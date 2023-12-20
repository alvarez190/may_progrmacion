package Unidad_6.actvidad5;

public class Actividad_5 {
    public static void main(String[] args) {
        //Variables 
        int numeros [] = {0,1,2,3,4,5,6,-7,-3,4, 5, 6, 7};

        // Incializa la clase MyArray
        MyArray claseMyArray = new MyArray(numeros);

        claseMyArray.visualizarArray();

        claseMyArray.visualizarContPar();

        claseMyArray.visualizarContImpar();


    }
}