package Unidad_6;

public class Actividad_7 {
    public static void main(String[] args) {
        // Creamos la matriz
        int[][] matriz = new int[5][7];

        // Rellenamos la matriz
        int numero = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {         
                matriz[i][j] = numero;
                numero ++;
            }
        }

        //Visualizamos toda la matriz
        System.out.println("Toda la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }

        //Visualizamos los elementos de la quinta fila
        System.out.println("La quinta fila de la matriz: ");
        for (int i = 0; i < matriz[4].length; i++) {
            System.out.print(matriz[4][i]);
        }

        System.out.println("\nEl elemento de la matriz 4 fila 3 columna ");
        System.out.println(matriz[3][2]);

        // Intercambiamos los valores de dos filas
        int[] aux = new int[7];
        for (int i = 0; i < matriz[0].length; i++) {
            aux[i] = matriz[3][i];
            // Los datos de la primera fila pasan a la cuarta
            matriz[3][i] = matriz[0][i];
            // Los datos de la cuarta fila pasan a la primera fila
            matriz[0][i] = aux[i];
        }

        System.out.println("Intercambiamos los valores de dos filas 1º y 3º");
        // Visualizamos ambas filas
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print("["+matriz[0][i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < matriz[3].length; i++) {
            System.out.print("["+matriz[3][i]+"]");
        }

    }
    
}