/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celsiusfahrenheit;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige una opcion (1: F a C , 2: C a F): ");

        int opcion = teclado.nextInt();

        if (opcion == 1) {

            System.out.println("Indique temperatura en Fahrenheit: ");

            double Fahrenheit = teclado.nextDouble();

            System.out.println("La temperatura en Celsius es: " + 0.5555 * (Fahrenheit - 32));

        } else if (opcion == 2) {

            System.out.println("Indique temperatura en Celsius: ");

            double Celsius = teclado.nextDouble();

            System.out.println("La temperatura en Fahrenheit es: " + (Celsius*1.8 + 32));

        } else {

            System.out.println("Opcion no valida.");

        }

    }

}
