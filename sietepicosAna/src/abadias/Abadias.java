/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abadias;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Abadias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        boolean seguir= true;
        while(seguir){
            int m= teclado.nextInt();
            if ( m==0){
               seguir=false;
            }
            int [] altura =   new int [m];
            for (int i = 0; i < m; i++) {
                altura[i]= teclado.nextInt();
            }
            int maxAlt = 0;
            int abadias = 0;

            for (int i = m- 1; i >= 0; i--) {
                if (altura[i] > maxAlt) {
                    abadias++;
                    maxAlt = altura[i];
                }
            }

            System.out.println(abadias);
        }
    }
    
}
