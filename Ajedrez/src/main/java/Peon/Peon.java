/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peon;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author pablo
 */
public class Peon {
    
    public int worldX, worldY; 
    
    public BufferedImage front; 
    public Rectangle area = new Rectangle(0,0,48,48); 
    public Rectangle nearSolidArea; 
    public int solidAreaDefaultX, solidAreaDefaultY; 
    public boolean collision = false; 
    
    public int actionLockCounter = 0; 
    
}
