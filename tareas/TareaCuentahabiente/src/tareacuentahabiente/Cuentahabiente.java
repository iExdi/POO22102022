/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author USER
 */
public class Cuentahabiente {
    private int idcliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idcliente, String nombre, float balance) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idcliente=" + idcliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public void retirarDinero (float monto){
         
        int mont=15000;
        float j;     
        j=balance-mont;
        j=balance;                   
}
    public String evaluarNiveldeCliente(){

      
              
        if (balance <= 50000.00f) {
            return "Cliente Regular";
        }else{
            return "Cliente Premium";
        }
           
    }       
}
