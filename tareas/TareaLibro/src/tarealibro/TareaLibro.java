/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import Libro.libro;
import clases.ico.Autor;
import clases.ico.Editorial;

/**
 *
 * @author USER
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        libro lib = new libro();
        lib.setGenero("Infantil");
        lib.setPaginas(104);
        
        Autor escritor = new Autor();
        escritor.setEdad(33);
        escritor.setNombre("Jose Guerrero Ventura");
        lib.setEscritor(escritor);
        
        Editorial editorial =new Editorial();
        editorial.setNombreLib("Trillas");
        editorial.setPais("México");
        lib.setEditorial(editorial);
        
        System.out.println(lib);
    }
    
}
