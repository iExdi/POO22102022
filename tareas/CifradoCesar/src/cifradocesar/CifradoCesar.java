/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifradocesar;

import ventana.swing.InterfazCesar;

/**
 *
 * @author USER
 */
public class CifradoCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfazCesar vs = new InterfazCesar();
        
      String lMayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
      String lMinus = "abcdefghijklmnñopqrstuvwxyz"; 
      
        Cifrado obj = new Cifrado(lMayus, lMinus);
        System.out.println(obj.cifrar ("hola", 3));
        
        
        
        
             
    }
    
}
