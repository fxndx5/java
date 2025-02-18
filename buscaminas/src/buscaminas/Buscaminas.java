/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaminas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buscaminas
        Scanner teclado= new Scanner (System.in);
        Random rd= new Random();
        
        int fila= teclado.nextInt();
        int columna=teclado.nextInt();
        int [][] tablero = new int [fila] [columna];
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                fila=rd.nextInt(*,-);
                System.out.println("");
            }
            
        }
    }
    
}
