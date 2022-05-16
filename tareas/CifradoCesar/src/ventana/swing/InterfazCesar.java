/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana.swing;


import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class InterfazCesar extends JFrame{

    private FlowLayout layout;
    private JTextField cuadroTexto;
    private JTextField cuadroNumero;
    
    private JButton cifrar;
    private JLabel resultado;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
   
    
    
    public InterfazCesar() throws HeadlessException {
        this.setTitle("Cifrado Cesar");
        this.setSize(200,400);
        this.setVisible(true);
        
        layout=new FlowLayout();
        this.setLayout(layout);
        
        etiqueta1 = new JLabel ("Ingresa el desplazamiento: ");
        cuadroNumero = new JTextField(2);
        etiqueta2 = new JLabel ("Ingresa el mensaje a cifrar: ");
        cuadroTexto = new JTextField(15);
        
        cifrar = new JButton ("Cifrar");
        
        resultado = new JLabel ("Mensaje Cifrado: ");
     
        
        this.getContentPane().add(etiqueta1);
        
        this.getContentPane().add(cuadroNumero);
        this.getContentPane().add(etiqueta2);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(cifrar);
        this.getContentPane().add(resultado);
        
        this.pack();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               
                System.exit(0);                           
            }        
        });
        
        
        
        
        this.cifrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Cifrando...");
            
                
            }
        
        });
               
    }
    
}
