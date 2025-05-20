/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import Conexion.Conexion;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pablo
 */
public class Mouse implements MouseListener{
    
    private int x,y; 
    public boolean estado = true; 
    private GamePanel gp; 
    PreparedStatement pt = null; 
    ResultSet rs = null; 
    
    public Mouse(GamePanel gp){
        this.gp  = gp; 
    }
    
    //Necesitamos saber la posición de las fichas al momento 
    private Connection getConnection() throws SQLException{
        return Conexion.getConnection(); 
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX() / gp.tileSize; 
        y = e.getY() / gp.tileSize; 
        
        System.out.println("Clicked on X: "+x + " Y: "+y);
        
        try{
            pt = getConnection().prepareStatement("SELECT * FROM peon WHERE posX = ? AND posY = ?"); 
            pt.setLong(1, x);
            pt.setLong(2, y);
            rs = pt.executeQuery(); 
            
            while(rs.next()){
                System.out.println("hola");
                if(rs.getString("nombre") == null){
                    System.out.println("No hay nada en la posicion "+x + " " + y);
                }
            }
        }catch(SQLException e2){
            
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        /*
        x = e.getX() / gp.tileSize; 
        y = e.getY() / gp.tileSize; 
        
        System.out.println("Pressed on X: "+x + " Y: "+y);
        */
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        /*
        x = e.getX() / gp.tileSize; 
        y = e.getY() / gp.tileSize; 
        
        System.out.println("Release on X: "+x + " Y: "+y);
        */
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
