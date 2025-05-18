/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peon;

import Juego.GamePanel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author pablo
 */
public class PeonManager extends Peon {
    GamePanel gp; 
    
    public final int screenX; 
    public final int screenY; 
    
    public int posicionDefaultX = 117; 
    public int posicionDefaultY = 16; 
    
    public int x, y; 
    
    public PeonManager(GamePanel gp, int x, int y){
        this.gp = gp; 
        this.x = x; 
        this.y = y; 
        
        screenX = gp.screenWidth / 2 - (gp.tileSize / 2); 
        screenY = gp.screenHeight / 2 - (gp.tileSize / 2); 
        
        area = new Rectangle(); 
        area.x = 8; 
        area.y = 16; 
        
        solidAreaDefaultX = area.x; 
        solidAreaDefaultY = area.y; 
        
        area.width = 32; 
        area.height = 32; 
        
        setDefaultValues(); 
        getPeonImage(); 
    }
    
    public void setDefaultValues(){
        
        worldX = x; 
        worldY = y; 
        
    }
    
    public void getPeonImage(){
        
        try{
            front = ImageIO.read(getClass().getResourceAsStream("/Player/Negro.png")); 
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void update(){
        
    }
    
    public void draw(Graphics2D g2){
        
        g2.drawImage(front, worldX , worldY, gp.tileSize, gp.tileSize, null); 
        
    }
    
}
