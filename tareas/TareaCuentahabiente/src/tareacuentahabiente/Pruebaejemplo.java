/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author USER
 */
public class Pruebaejemplo {
   
    
    public static void main(String[] args) {
        
    Cuentahabiente[] lista=new Cuentahabiente[5];
        lista [0] = new Cuentahabiente(123, "Juan",100000);
        lista [1] = new Cuentahabiente(145,"Pedro",255622);
        lista [2] = new Cuentahabiente(126,"Jesus",3444444);
        lista [3] = new Cuentahabiente(257,"Jorge",40000);
        lista [4] = new Cuentahabiente(172,"David",500000);
        for (Cuentahabiente cuentahabiente : lista) {
            
            System.out.println("El cliente: " +cuentahabiente.getNombre() + "    Es un : "+ cuentahabiente.evaluarNiveldeCliente() );            
    }
        
  }
}
