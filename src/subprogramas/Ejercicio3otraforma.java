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
public class Ejercicio3otraforma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de euros que desea convertir");
        double euros = sc.nextInt();
        ConvertidorMoneda(euros);
    }

    public static void ConvertidorMoneda(double euros) {
        double libras = 0.86 * euros;
        double pesos = 1.28611 * euros;
        double yenes = 129.852 * euros;
        System.out.println("Euro convertido a libras es: " + libras);
        System.out.println("Euro convertido a pesos es: " + pesos);
        System.out.println("Euro convertido a yenes es: " + yenes);
    }
}
