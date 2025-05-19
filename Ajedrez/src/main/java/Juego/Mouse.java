/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author pablo
 */
public class Mouse implements MouseListener{
    
    private int x,y; 
    public boolean estado = true; 
    private GamePanel gp; 
    
    public Mouse(GamePanel gp){
        this.gp  = gp; 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX() / gp.tileSize; 
        y = e.getY() / gp.tileSize; 
        System.out.println("X -> "+x+ " Y -> "+y);
        estado = false; 
        System.out.println(estado);
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
