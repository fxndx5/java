/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam
 */
public class Mensaje {
    private String mensaje;

    public Mensaje() {
        this.mensaje = mensaje;
    }
    
    
    public String cifrar(String mensaje){
        char [] rotacion = mensaje.toCharArray();
        int numRotar ;
        char caracter = 0;
        for (int i = 0; i <rotacion.length; i++) {
            if (rotacion[i] != ' '){
                numRotar=  (int) rotacion[i];
                if (numRotar > 77){
                    numRotar -= 26;
                }
                numRotar+= 13;
                caracter= (char) numRotar;
                rotacion  [i] = caracter;
            }
            
        }
        
        return String.valueOf(rotacion) ;
    }
    
    public String descifrar(String mensaje){
       char [] desc = mensaje.toCharArray();
        int numRotar ;
        char caracter = 0;
        for (int i = 0; i <desc.length; i++) {
            if (desc[i] != ' '){
                numRotar=  (int) desc[i];
                if (numRotar < 78){
                    numRotar += 26;
                }
                numRotar-= 13;
                caracter= (char) numRotar;
                desc  [i] = caracter;
            }
            
        }
        
        return String.valueOf(desc);
    }
    
    public String cifrar2 (String mensaje ,int nPosiciones){
        char [] rotacion = mensaje.toCharArray();
        int numRotar ;
        char caracter = 0;
        for (int i = 0; i <rotacion.length; i++) {
            if (rotacion[i] != ' '){
                numRotar=  (int) rotacion[i];
                if (numRotar > 77){
                    numRotar -= (nPosiciones*2);
                }
                numRotar+= nPosiciones;
                caracter= (char) numRotar;
                rotacion  [i] = caracter;
            }
            
        }
        
        return String.valueOf(rotacion) ;
    }
    
    // ESTE METODO ME HA COSTADO UN POCO MAS, YA QUE NO HE PODIDO PILLARLE 
    public String descifrar2 (String mensaje, int nPosiciones){
        char [] desc = mensaje.toCharArray();
        int numRotar ;
        char caracter = 0;
        for (int i = 0; i <desc.length; i++) {
            if (desc[i] != ' '){
                numRotar=  (int) desc[i];
                if (numRotar < 78){
                    numRotar += (nPosiciones%2); //calculo mal
                }
                numRotar-= nPosiciones;
                caracter= (char) numRotar;
                desc  [i] = caracter;
            }
            
        }
        
        return String.valueOf(desc);
    }
    
    
    
}
