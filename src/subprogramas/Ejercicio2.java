/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas 
por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle 
al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
       //personas();
         String respuesta;
        
        do {
            personas();
            System.out.println("Quiere agregar otra persona?");
            
        respuesta = sc.next();
        } while (!respuesta.equalsIgnoreCase("no"));

    }   
    
    public static void personas(){
         Scanner sc= new Scanner(System.in);

            System.out.println("Ingrese el nombre");
            String nombre = sc.next();
            System.out.println("Ingrese la edad de la persona");
            int edad = sc.nextInt();
            if (edad>=18) {
                System.out.println("Es mayor");
            } else {
                System.out.println("Es menor");
            }   
            
           
        
        
        
        
        
        
        
    }
    
}
    

