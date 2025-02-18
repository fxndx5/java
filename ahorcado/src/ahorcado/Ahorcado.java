/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ahorcado
        
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        String palabra = "VAMOS A PROGRAMAR";
        char[] letras = palabra.toCharArray();
        char[] vacio = new char[letras.length];

        System.out.println("****AHORCADO****");
        
        for (int i = 0; i < vacio.length; i++) {
            if (letras[i] == ' ') {
                vacio[i] = ' ';
            } else {
                vacio[i] = '_';
            }
        }

        while (seguir) {
            System.out.println("Introduce letra:");
            char letraJugador = teclado.next().charAt(0);

            for (int i = 0; i < letras.length; i++) {
                if (letraJugador == letras[i]) {
                    vacio[i] = letraJugador;
                }
            }
            for (int i = 0; i < vacio.length; i++) {
                System.out.print(vacio[i]);
            }
            System.out.println(" ");

            if (Arrays.equals(vacio, letras)) {
                System.out.println("***HAS GANADO***");
                seguir = false;
            }
        }

    }
}
