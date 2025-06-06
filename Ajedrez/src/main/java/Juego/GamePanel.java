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
import java.util.ArrayList;
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
    public Mouse m = new Mouse(this); 
    public MenuPanel mp = new MenuPanel(this); 
   
    
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
        
        // g2.drawString("Me cago en las muelas", tileSize * 2, tileSize * 2); 
        
        g2.dispose(); 
        
    }
    
}
