/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class Adivinarnumero {

    /**
     * Realizar un programa en el que el programa genere un número aleatorio
     * entre 1-20. El usuario tiene que adivinar el número. Si lo adivina
     * entonces el programa escribirá "Enhorabuena, lo has adivinado". Si no lo
     * adivina escribirá "Lo siento no lo has adivinado"
    /
     *
     **
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rd = new Random();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 20:");

        int introducido = teclado.nextInt();

        int aleatorio = rd.nextInt(1, 20);
        
      // Tambien sirve int alearorio = (innt) Math.random()* 21 + 1

        if (aleatorio == introducido) {

            System.out.println("Enhorabuena, lo has adivinado.");

        } else if (aleatorio != introducido) {

            System.out.println("Lo siento no lo has adivinado." + " " +  "El numero era:" + " " + aleatorio);

        }

    }

}
