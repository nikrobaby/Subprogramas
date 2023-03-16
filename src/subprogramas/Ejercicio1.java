/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y
deben devolver sus resultados para imprimirlos en el main. 

 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Opcion: ");
        int opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma de los numeros es " + suma (num1 , num2));
                break;
                case 2:
                System.out.println("La resta de los numeros es " + resta (num1 , num2));
                break;
                case 3:
                System.out.println("La multiplicacion de los numeros es " + multiplicacion (num1 , num2));
                break;
                case 4:
                System.out.println("La division de los numeros es " + division (num1 , num2));
                break;
            
                
        }
        
    }
    /**
     * esta funcion suma
     * @param num1
     * @param num2
     * @return 
     */
    public static int suma (int num1, int num2) {

    return num1+num2;
}
    /**
     * esta funcion resta
     * @param num1
     * @param num2
     * @return 
     */
    
    public static int resta (int num1, int num2) {

    return num1-num2;
    }
    public static int multiplicacion (int num1, int num2) {

    return num1*num2;
    }
    public static double division (int num1, int num2) {

    return (double) num1 /  num2;
    }
}
     


    
    
    

