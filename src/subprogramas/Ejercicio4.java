/*
Crea una aplicación que nos pida un número por teclado y con una función
se lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver
true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero;
        numero=sc.nextInt();

        if (numeroPrimo(numero)) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");  
        }
        
    }
    public static boolean numeroPrimo (int numero){
        
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i==0) {
                return false;
            }
        }
        
        
        /*for (int i = 1; i < numero ; i++) {
            if (numero % i==0 && i!=1 && i!=numero) {
               return false;       // Esto funciona tambien.//
            }
        }
*/
        return true;
   }
}
