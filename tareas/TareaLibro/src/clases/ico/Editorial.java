/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.ico;

/**
 *
 * @author USER
 */
public class Editorial {
    private String nombreLib;
    private String pais;

    public Editorial() {
    }

    public Editorial(String nombreLib, String pais) {
        this.nombreLib = nombreLib;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreLib() {
        return nombreLib;
    }

    public void setNombreLib(String nombreLib) {
        this.nombreLib = nombreLib;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreLib=" + nombreLib + ", pais=" + pais + '}';
    }
    
    
    
}
