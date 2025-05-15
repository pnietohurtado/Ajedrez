/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez.piezas;

import com.mycompany.ajedrez.Color;

/**
 *
 * @author pablo
 */
public class Peon extends Pieza{
    
    private int id; 
    private static int contador; 
    
    
    public Peon(int x, int y, Color c){
        super(x,y,c); 
        this.id = ++contador; 
    }
    
    public void movimiento(int dado, String[][] tablero){
        
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append("-ID: ").append(this.id).append(" -X: ").append(super.getPosicionX()).append(" -Y: ").append(super.getPosicionY()).append(" -Color: ").append(super.getColor()).append("\n"); 
        return sb.toString(); 
    }
    
}
