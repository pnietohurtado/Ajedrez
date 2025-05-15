/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Main {
    public static void cerrar(JFrame w) {
            try {
                w.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                w.addWindowListener(new WindowAdapter() { 
                    @Override
                    public void windowClosing(WindowEvent e) {
                        confirmarSalida();
                    }
                });
            } catch (Exception r) {
                r.printStackTrace();
            }
        }
        
        
        public static void confirmarSalida(){
            int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres cerrar el juego?","Advertencia", JOptionPane.YES_NO_OPTION ); 
            if(valor==JOptionPane.YES_OPTION){
                
                System.exit(0);
            }
        }
        
        
        
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame(); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setTitle("Ajedrez");
        System.out.println("hola");
        
        GamePanel gp = new GamePanel(); 
        ventana.add(gp);
        cerrar(ventana); 
        ventana.pack(); 
        
        ventana.setLocationRelativeTo(null); 
        ventana.setVisible(true); 
        
    }
                
}
