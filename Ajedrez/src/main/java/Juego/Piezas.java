/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import Peon.PeonManager;
import java.awt.Graphics2D;

/**
 *
 * @author pablo
 */
public class Piezas {
    
    GamePanel gp; 
    
    public Piezas(GamePanel gp){
        this.gp = gp; 
    }
    
    //Declaración de los peones
    public PeonManager pN1 = new PeonManager(this.gp, this.gp.tileSize, this.gp.tileSize * 7); 
    public PeonManager pN2 = new PeonManager(this.gp, this.gp.tileSize * 2, this.gp.tileSize * 7); 
    public PeonManager pN3 = new PeonManager(this.gp, this.gp.tileSize * 3, this.gp.tileSize * 7); 
    public PeonManager pN4 = new PeonManager(this.gp, this.gp.tileSize * 4, this.gp.tileSize * 7); 
    public PeonManager pN5 = new PeonManager(this.gp, this.gp.tileSize * 5, this.gp.tileSize * 7); 
    public PeonManager pN6 = new PeonManager(this.gp, this.gp.tileSize * 6, this.gp.tileSize * 7); 
    public PeonManager pN7 = new PeonManager(this.gp, this.gp.tileSize * 7, this.gp.tileSize * 7); 
    public PeonManager pN8 = new PeonManager(this.gp, this.gp.tileSize * 8, this.gp.tileSize * 7); 
    
  
    
}
