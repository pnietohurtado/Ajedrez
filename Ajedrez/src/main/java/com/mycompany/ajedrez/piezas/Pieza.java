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
public class Pieza {
    
    private int posicionX; 
    private int posicionY; 
    private Color color; 
    
    public Pieza(int x ,int y, Color c){
        this.posicionX = x; 
        this.posicionY = y; 
        this.color = c; 
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" -X: ").append(this.posicionX).append(" -Y: ").append(this.posicionY).append(" -Color: ").append(this.color).append("\n"); 
        return sb.toString(); 
    }
    
}
