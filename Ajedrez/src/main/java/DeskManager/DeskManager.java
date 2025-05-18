/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeskManager;

import Juego.GamePanel;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;

/**
 *
 * @author pablo
 */
public class DeskManager {
    GamePanel gp; 
    public Desk[] ds; 
    public int deskNum[][]; 
    
    public String desk = "Desk"; 
    
    public DeskManager(GamePanel gp){
        this.gp = gp; 
        ds = new Desk[100]; 
        
        deskNum = new int[gp.maxScreenCol][gp.maxScreenRow]; 
        
        getDeskImage(); 
        loadDesk("/mapa/Mapa.txt"); 
    }
    
    public void getDeskImage(){
        try{
            
            ds[0] = new Desk(); 
            ds[0].image = ImageIO.read(getClass().getResourceAsStream("/Desk/Blanco.png")); 
            ds[0].collision = true; 
            
            ds[1] = new Desk(); 
            ds[1].image = ImageIO.read(getClass().getResourceAsStream("/Desk/Negro.png")); 
            ds[1].collision = true; 
            
            ds[2] = new Desk(); 
            ds[2].image = ImageIO.read(getClass().getResourceAsStream("/Desk/madera.png")); 
            ds[2].collision = true; 
            
            
        }catch(IOException e){
            
        }
    }
    
    public void loadDesk(String path){
        try{
            
            InputStream is = getClass().getResourceAsStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
            
            int col = 0; 
            int row = 0; 
            
            while(col < gp.maxScreenCol && row < gp.maxScreenRow ){
                String line = br.readLine(); 
                
                while(col < gp.maxScreenCol ){
                    String numbers[] = line.split(" "); 
                    
                    int num = Integer.parseInt(numbers[col]); 
                    deskNum[col][row] = num; 
                    col++; 
                }
                
                if(col == gp.maxScreenCol){
                    col = 0; 
                    row++; 
                }
            }
            
            br.close(); 
        }catch(Exception e){
            
        }
    }
    
    public void draw(Graphics2D g2){
        int col = 0; 
        int row = 0; 
        int x = 0; 
        int y = 0; 
        
        while(col < gp.maxScreenCol && row < gp.maxScreenRow){
            
            int tileNum = deskNum[col][row]; 
            
            g2.drawImage(ds[tileNum].image, x,y,gp.tileSize,gp.tileSize,null); 
            col++; 
            x += gp.tileSize; 
            
            if(col == gp.maxScreenCol){
                col = 0; 
                x = 0; 
                row++; 
                y += gp.tileSize; 
            }
        }
        
    }
    
    
}


