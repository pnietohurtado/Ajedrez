/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import DeskManager.DeskManager;
import Peon.PeonManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */
public class GamePanel extends JPanel implements Runnable{

    final int originalTileSize = 19; 
    final int scale = 3; 
    
    public final int tileSize = originalTileSize * scale; 
    public final int maxScreenCol = 10; 
    public final int maxScreenRow = 10; 
    public final int screenWidth = tileSize * maxScreenCol; 
    public final int screenHeight = tileSize * maxScreenRow; 
    
    public Thread gameThread; 
    public Thread startThread; 
    public DeskManager dk = new DeskManager(this); 
    public Mouse m = new Mouse(); 
    public MenuPanel mp = new MenuPanel(this); 
    
    //Declaración de los peones
    public PeonManager pN1 = new PeonManager(this, this.tileSize, this.tileSize * 7); 
    public PeonManager pN2 = new PeonManager(this, this.tileSize * 2, this.tileSize * 7); 
    public PeonManager pN3 = new PeonManager(this, this.tileSize * 3, this.tileSize * 7); 
    public PeonManager pN4 = new PeonManager(this, this.tileSize * 4, this.tileSize * 7); 
    public PeonManager pN5 = new PeonManager(this, this.tileSize * 5, this.tileSize * 7); 
    public PeonManager pN6 = new PeonManager(this, this.tileSize * 6, this.tileSize * 7); 
    public PeonManager pN7 = new PeonManager(this, this.tileSize * 7, this.tileSize * 7); 
    public PeonManager pN8 = new PeonManager(this, this.tileSize * 8, this.tileSize * 7); 
    
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); 
        this.setFocusable(true); 
        this.setLayout(null);
        this.addMouseListener(m);
    }
    
    public void startThread(){
        gameThread = new Thread(this); 
        gameThread.start(); 
    }
    
    public void gameStart(){
        startThread = new Thread(mp); 
        startThread.start(); 
    }
    
    public final int FPS = 60; 
    
    @Override
    public void run() {
         double drawInterval = 1000000000/FPS;  
        double delta = 0; 
        long lastTime = System.nanoTime(); 
        long currentTime; 
        
       
        long timer = 0; 
        int drawCount = 0; 
        
       
        while(gameThread != null) 
        {
            
            currentTime = System.nanoTime(); 
            
            delta += (currentTime - lastTime) / drawInterval; 
            timer += (currentTime - lastTime); 
            lastTime = currentTime; 
            
            //System.out.println(m.estado);
            
            if(delta >= 1){
                update(); 
                repaint();  
                delta--; 
                drawCount++; 
            }
            
            
            
        }
    }
    
    
    public void update(){
        
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D) g; 
        
        dk.draw(g2);
        pN1.draw(g2); 
        pN2.draw(g2); 
        pN3.draw(g2); 
        pN4.draw(g2); 
        pN5.draw(g2); 
        pN6.draw(g2); 
        pN7.draw(g2); 
        pN8.draw(g2); 
        // g2.drawString("Me cago en las muelas", tileSize * 2, tileSize * 2); 
        
        g2.dispose(); 
        
    }
    
}
