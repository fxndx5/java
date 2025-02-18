/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_anagrama;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Ej_anagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero de intentos: ");
        int intentos = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 1; i <= intentos; i++) {

            System.out.println("Introduzca primera frase: ");
            String frase1 = teclado.nextLine();
            

            System.out.println("Introuzca segunda frase: ");
            
            String frase2 = teclado.nextLine();
            
            frase1 = frase1.toLowerCase().replaceAll("\\s","");
            frase2 = frase2.toLowerCase().replaceAll("\\s","");
            
            char[] letras1 = frase1.toCharArray();
            char[] letras2 = frase2.toCharArray();
            Arrays.sort(letras1);
            Arrays.sort(letras2);

            if (Arrays.equals(letras1, letras2)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            System.out.println(" ");
        }
    
    }
    
}
