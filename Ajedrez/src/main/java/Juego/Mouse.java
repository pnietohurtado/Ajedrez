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

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX(); 
        y = e.getY(); 
        System.out.println("X -> "+x+ " Y -> "+y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX(); 
        y = e.getY(); 
        System.out.println("X -> "+x+ " Y -> "+y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX(); 
        y = e.getY(); 
        System.out.println("X -> "+x+ " Y -> "+y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        x = e.getX(); 
        y = e.getY(); 
        System.out.println("X -> "+x+ " Y -> "+y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        x = e.getX(); 
        y = e.getY(); 
        System.out.println("X -> "+x+ " Y -> "+y);
    }
    
}
