/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrenamiento_imperial;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Entrenamiento_Imperial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // capacidad soldado = distancia y desnivel maximos 
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce la distancia: ");
        int distancia= teclado.nextInt();
        if (distancia>=30000){
            System.out.println("Introducir otra distancia: ");
        }
    }
    
}
