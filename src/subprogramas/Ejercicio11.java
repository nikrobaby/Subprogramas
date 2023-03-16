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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase=sc.nextLine();
        cambiarFrase(frase);
        System.out.println(cambiarLetra(frase));

    }
    
    public static String cambiarLetra(String palabra) {
         palabra=palabra.replaceAll("a", "@");
         palabra=palabra.replaceAll("e", "#"); 
         palabra=palabra.replaceAll("i", "$");
         palabra=palabra.replaceAll("o", "%");
         palabra=palabra.replaceAll("u", "*");
       
         
         return palabra;
        
        
        
        }
    public static String cambiarFrase (String frase) {
    String auxi="";
            for (int i = 0; i < frase.length(); i++) {
               char aux = frase.charAt(i);
                switch (aux) {
                    case 'a':
                        auxi+= '@'; //aux.concat("@");
                        break;
                        case 'e':
                        auxi+='#';
                        break;
                        case 'i':
                        auxi+='$';
                        break;
                        case 'o':
                        auxi+='%';
                        break;
                        case 'u':
                         auxi+='*';
                        break;
                        
                    default:
                         auxi+=aux;       //aux=aux.concat(String.valueOf(frase.charAt(i)));
                }
        }
        
        
        
    
            return frase;
    }
    
    }

    
    

