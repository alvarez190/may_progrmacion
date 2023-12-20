public class Actividad5 {
    public static void main(String[] args) {
        //defino variables
        int dinero_cliente=2000;
        double interes_anual;
        double interes_hacienda;
        double interes_final_cliente;
        //calculo
        interes_anual=dinero_cliente*2.75/100;
        interes_final_cliente=interes_anual/2*18/100;
        //imprimir el resultado
        System.out.println("El resultado es " + interes_final_cliente);

    }
    
}
