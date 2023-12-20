package Unidad_6.actividad6;

public class Pizza {

    //Variables
    double precioMasa = 0;
    String nombreMasa; 

    String[] nombreIngredientes;    
    double[] precioIngredientes = {0};

    double precioTotal = 0;

    public Pizza() {
    }

    public void setMasa(int tipoMasa) {

        switch (tipoMasa) {
            case 1:
                nombreMasa = "Masa Fina";
                precioMasa = 2.5;
                break;
            case 2:
                nombreMasa = "Masa Gruesa";
                precioMasa = 3.5;
                break;
            case 3:
                nombreMasa = "Masa Gruesa con borde relleno de queso";
                precioMasa = 4.5;
                break;
            default:
                nombreMasa = "Masa Fina";
                precioMasa = 2.5;
                break;
        }

    }

    public void setIngredientes(int[] listaIngredientes) {
        for (int i = 0; i < listaIngredientes.length; i++) {
            switch (listaIngredientes[i]) {
                case 1:
                    nombreIngredientes[i] = "Tomate";
                    precioIngredientes[i] = 2;
                    
                    break;
                case 2:
                    nombreIngredientes[i] = "Mozzarela";
                    precioIngredientes[i] = 1;
                    
                    break;
                case 3:
                    nombreIngredientes[i] = "Queso Azul";
                    precioIngredientes[i] = 1.3;
                    
                    break;
                case 4:
                    nombreIngredientes[i] = "Jamon York";
                    precioIngredientes[i] = 2;
                    
                    break;
                case 5:
                    nombreIngredientes[i] = "Chedar";
                    precioIngredientes[i] = 1.5;
                    
                    break;
            
                default:
                    break;
            }
        }
    }

    public String getMasa() {
        return nombreMasa;
    }

    public String[] getIngredientes() {
        return nombreIngredientes;
    }

    public double precio(){
        
        precioTotal += precioMasa;

        for (int i = 0; i < precioIngredientes.length; i++) {
            precioTotal += precioIngredientes[i];
        }

        return precioTotal;
    }
}
