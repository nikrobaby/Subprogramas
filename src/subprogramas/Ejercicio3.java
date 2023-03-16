/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a 
otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros");
        double euros= sc.nextDouble();
        System.out.println("A que quiere cambiar? (Dolares, Yenes o Libras)");
        String respuesta=sc.next();
        cambioMonedas(euros, respuesta);
    }
    
    public static void cambioMonedas( double euros, String tipoMoneda){
    
        switch (tipoMoneda) {
            case "Dolares":
                    System.out.println("El cambio a dolares es: " + (euros*1.28611));
                break;
                case "Yenes":
                    System.out.println("El cambio a Yenes es: "+ (euros*129.852));
                break;
                case "Libras":
                    System.out.println("El cambio a Libras es: "+ (euros*0.86));
                break;
                    
                   
        }
    
    }
    
    
}
