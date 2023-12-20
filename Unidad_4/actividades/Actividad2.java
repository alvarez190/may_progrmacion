public class Actividad2 {
    public static void main(String[] args) {
        // variables con valores
        int numA = 20;
        int numB = 0;
        int numC = 10;
        int numD = 15;

        System.out.print ("El mayor de los numeros es "+ mayor(numA, numB, numC, numD));
    }

    // metodo
    static int mayor(int numA, int numB, int numC, int numD) {
        if (numA >= numB && numA >= numC && numA >= numD) {
            return numA;
        } else if (numB >= numC && numB >= numD) {
            return numB;
        } else if (numC >= numD) {
            return numC;
        }else {
            return numD;
        }
    }

}
