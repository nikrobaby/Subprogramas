/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese dos numeros");
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        EsMultiplo(num1, num2);
    
        
    }
    
    public static void EsMultiplo(int num1, int num2) {
       
       // int modulo;

         if (num1 % num2 ==0 ) {
            System.out.println(num1 + " Es multiplo de " + num2);
            } else {
            System.out.println(num1 + " No es multiplo de " + num2);
        }
        
        
    }
    
}
