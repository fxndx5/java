/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carreracaballos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class CarreraCaballos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int cont = 0;

        System.out.println("Introduzca el numero de carreras (minimo 2)");
        int nCarreras = sc.nextInt();

        while (nCarreras < 2) {
            System.out.println("Error. Introduzca el numero de carreras");
            nCarreras = sc.nextInt();
        }

        System.out.println("Introduzca el largo de pista (minimo 200m y maximo 800m)");
        int largo = sc.nextInt();

        while (largo < 200 || largo > 800) {
            System.out.println("Error. Introduzca el numero de largo de la pista (minimo 200m y maximo 800m)");
            largo = sc.nextInt();
        }
		
        for (int i = 0; i < nCarreras; i++) {
            System.out.println("******************* INICIANDO EL JUEGO NUMERO " + cont + 1 + " *******************");
            System.out.println("Elige un caballo jugador1 (1 o 2)");
            int caballoJugador1 = sc.nextInt();

            while (caballoJugador1 != 1 && caballoJugador1 != 2) {
                System.out.println("La opcion es incorrecta elige el caballo 1 o 2");
                caballoJugador1 = sc.nextInt();
            }
            int caballoJugador2;
            if (caballoJugador1 == 1) {
                caballoJugador2 = 2;
            } else {
                caballoJugador2 = 1;
            }
            System.out.println("El caballo del jugador 1 es el " + caballoJugador1);
            System.out.println("El caballo del jugador 2 es el " + caballoJugador2);
            
			while (posicionCaballo1 < largoPista && posicionCaballo2 < largoPista) {
                numeroCarreraRealizada++;
                int avanceCaballo1 = calcularAvance(numeroCarreraRealizada, random);
                int avanceCaballo2 = calcularAvance(numeroCarreraRealizada, random);
 
                posicionCaballo1 += avanceCaballo1;
                posicionCaballo2 += avanceCaballo2;
 
                // Mostrar posiciones en cada etapa
                System.out.println("En la etapa " + numeroCarreraRealizada + ":");
                System.out.println("El caballo 1 se encuentra en la posición: " + posicionCaballo1);
                System.out.println("El caballo 2 se encuentra en la posición: " + posicionCaballo2);
            }
			
			
        }
		private static int calcularAvance(int numeroCarreraRealizada, Random random) {
            int avance;
            do {
                avance = random.nextInt(11) - (int) (numeroCarreraRealizada * 0.1);
            } while (avance <= 0);
 
            return avance;
        }
    }
}