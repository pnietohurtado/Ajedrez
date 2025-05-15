/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class LogicaFichas {
    
    public static void mostrarTablero(String[][] tablero){
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void peon(String[][] tablero, int x , int y, String fichaAct){
        int xAux = 0; 
        int yAux = 0; 
        
        if(fichaAct.equals("pB")){
            
            xAux = x-2; 
            yAux = y; 
            
            System.out.println(tablero[xAux][yAux]);
            
            if(!(tablero[xAux][yAux].equals(" 0 "))){
                tablero[xAux][yAux] = " pB ";
                tablero[x][y] = "0"; 
            }
            
        }else if(fichaAct.equals("pN")){
            xAux = x + 2; 
            yAux = y; 
            
            if(!(tablero[xAux][yAux].equals(" 0 "))){
                tablero[xAux][yAux] = " pN "; 
                tablero[x][y] = "0";  
            }
        }
    }
    
    public static void main(String[] args) {
        
        int posX = 0; 
        int posY = 0; 
        String fichaAct = ""; 
        
        String[][] tablero = {
            {"tN1", "cN1", "aN1", "rN1", "rN2", "aN2", "cN2", "tN2"}, 
            {"pN1", "pN2", "pN3", "pN4", "pN5", "pN6", "pN7", "pN8"},
            {" 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 "}, 
            {" 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 "}, 
            {" 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 "}, 
            {" 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 ", " 0 "}, 
            {"pB1", "pB2", "pB3", "pB4", "pB5", "pB6", "pB7", "pB8"},
            {"tB1", "cB1", "aB1", "rB1", "rB2", "aB2", "cB2", "tB2"}
        }; 
        Scanner sc = new Scanner(System.in); 
        String opcion = ""; 
        
        do{
            System.out.println("===============================");
            mostrarTablero(tablero); 
            System.out.println("===============================");
            System.out.println("[1] Mover una ficha");
            System.out.println("[0] Salir");
            System.out.print("Eleccion: ");
            opcion = sc.nextLine(); 
            
            switch(opcion){
                case "1": {
                    System.out.print("Dime la posicion X de la ficha: ");
                    posX = sc.nextInt(); 
                    System.out.print("Dime la posicion Y de la ficha: ");
                    posY = sc.nextInt(); 
                    
                    fichaAct = tablero[posX][posY]; 
                    fichaAct = fichaAct.substring(0, fichaAct.length() - 1); 

                    if(fichaAct.equals("pB") || fichaAct.equals("pN")){
                        
                        peon(tablero, posX, posY, fichaAct); 
                    }
                    break;
                }
                    
            }
            
            
        }while(!(opcion.equals("0"))); 
           
        
        
    }
}
