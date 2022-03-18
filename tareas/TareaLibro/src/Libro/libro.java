/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import clases.ico.Autor;
import clases.ico.Editorial;

/**
 *
 * @author USER
 */
public class libro {
    private String genero;
    private int paginas;
    private Autor escritor;
    private Editorial editorial;

    public libro() {
    }

    public libro(String genero, int paginas, Autor escritor, Editorial editorial) {
        this.genero = genero;
        this.paginas = paginas;
        this.escritor = escritor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "libro{" + "genero=" + genero + ", paginas=" + paginas + ", escritor=" + escritor + ", editorial=" + editorial + '}';
    }
    
    
    
}
