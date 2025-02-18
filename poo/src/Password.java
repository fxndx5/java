/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam
 */
public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        
        return password;
    }
    
    
    
    //metodos
    public static String esValida(String password){
        char [] caracteres= password.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
           if (caracteres[i]>=8 && caracteres[i]== i.toUpperCase()) 
        }
    }
    
}
