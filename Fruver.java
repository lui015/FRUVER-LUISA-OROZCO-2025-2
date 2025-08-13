//ANALISIS:
/*
* Entradas: cant_bananos (double), cant_manzanas (double)
* Salidas: subt_bananos (double), subt_manzanas (double), total_sin_descuento(double),
* descuento_aplicado (double), totalfinal (double)
*
*
*/
import java.util.Scanner;

public class Fruver{
    public static void main(String[] args){

        final double precio_manzana = 1000;
        final double precio_banano = 800;
        final double descuento = 0.1;

        Scanner escaner = new Scanner(System.in);
    
        
        System.out.println("Cantidad de manzanas:");
        double manzanas = escaner.nextDouble();
        escaner.nextLine();

        System.out.println("Cantidad de bananas:");
        double bananos = escaner.nextDouble();
        escaner.nextLine();

        double subt_manzanas, subt_bananos, total_sin_descuento, descuento_aplicado, total_final;
        subt_manzanas = calcular_subtotal(manzanas, precio_manzana);
        subt_bananos = calcular_subtotal(bananos, precio_banano);

        System.out.println("El subtotal a pagar de manzanas es: " + subt_manzanas);
        System.out.println("El subtotal a pagar de bananos es: " + subt_bananos);

        total_sin_descuento = calcular_total_sin_descuento (subt_manzanas, subt_bananos);
        System.out.println("El total sin descuento es: " + total_sin_descuento);

        descuento_aplicado = calcular_descuento_aplicado (total_sin_descuento, descuento );
        System.out.println("El valor del descuento aplicado es: " + descuento_aplicado);

        total_final = calcular_total_final (total_sin_descuento, descuento_aplicado );
        System.out.println("El valor total de su compra es: " + total_final);
    
    }

    public static double calcular_subtotal (double cantidad, double precio){
        double subtotal = cantidad * precio;
        return subtotal;
    }

    public static double calcular_total_sin_descuento (double subt_manzanas, double subt_bananos){
        double total_sin_descuento = subt_manzanas + subt_bananos;
        return total_sin_descuento;
    }

    public static double calcular_descuento_aplicado (double total_sin_descuento, double descuento){
        double descuento_aplicado = total_sin_descuento *descuento;
        return descuento_aplicado;
    }

    public static double calcular_total_final (double total_sin_descuento, double descuento_aplicado){
        double total_final = total_sin_descuento - descuento_aplicado;
        return total_final;
    }


}