/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

/**
 *
 * @author pablo
 */
public enum Color {
    BLANCO("Blanco"), 
    NEGRO("Negro"); 
    
    private String color; 
    
    private Color(String n){
        this.color = n; 
    }
    
    @Override 
    public String toString(){
        return this.color; 
    }
}
