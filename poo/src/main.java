
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String mensaje = "ABC MNO XYZ";
        
        Mensaje mensajeOriginal =new Mensaje ();
        
        System.out.println(mensajeOriginal.cifrar(mensaje));
        System.out.println(mensajeOriginal.descifrar(mensajeOriginal.cifrar(mensaje)));
        System.out.println(mensajeOriginal.cifrar2(mensaje, 4));
        System.out.println(mensajeOriginal.descifrar2(mensajeOriginal.cifrar2(mensaje,4),4));
    }
}
