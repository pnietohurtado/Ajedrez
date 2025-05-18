/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author pablo
 */
public class MenuPanel implements Runnable{

    GamePanel gp; 
    
    public MenuPanel(GamePanel gp){
        this.gp = gp; 
    }
    
    @Override
    public void run() {
        System.out.println("hola");
    }
    
}
