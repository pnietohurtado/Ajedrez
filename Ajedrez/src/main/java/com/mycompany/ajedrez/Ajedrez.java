/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ajedrez;

import com.mycompany.ajedrez.piezas.Peon;
import com.mycompany.ajedrez.piezas.Pieza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ajedrez {
    
    public static int ganador(String[][] tablero){
        int hayGanador = 1; 
        
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(tablero[i][j].equals("rN2") || tablero[i][j].equals("rB1")){
                    hayGanador = 0; 
                }
            }
        }
        
        return hayGanador; 
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String opcion = ""; 
        String movimiento = ""; 
        
        Pieza p; 
        
        ArrayList<Pieza> blancas = new ArrayList<Pieza>(); 
        
        //Fichas Blancas
        Peon pB1 = new Peon(0, 1 , Color.BLANCO); 
        Peon pB2 = new Peon(1, 1 , Color.BLANCO); 
        Peon pB3 = new Peon(2, 1 , Color.BLANCO); 
        Peon pB4 = new Peon(3, 1 , Color.BLANCO); 
        Peon pB5 = new Peon(4, 1 , Color.BLANCO); 
        Peon pB6 = new Peon(5, 1 , Color.BLANCO); 
        Peon pB7 = new Peon(6, 1 , Color.BLANCO); 
        Peon pB8 = new Peon(7, 1 , Color.BLANCO); 
        
        blancas.add(pB1); 
        blancas.add(pB2); 
        blancas.add(pB3); 
        blancas.add(pB4); 
        blancas.add(pB5); 
        blancas.add(pB6); 
        blancas.add(pB7); 
        blancas.add(pB8); 
        
        String[][] tablero = {
            {"tN1", "cN1", "aN1", "rN1", "rN2", "aN2", "cN2","tN2"}, 
            {"pN1", "pN2", "pN3", "pN4", "pN5", "pN6", "pN7", "pN8"},
            {"0", "0", "0", "0", "0", "0", "0", "0"}, 
            {"0", "0", "0", "0", "0", "0", "0", "0"}, 
            {"0", "0", "0", "0", "0", "0", "0", "0"}, 
            {"0", "0", "0", "0", "0", "0", "0", "0"}, 
            {"pB1", "pB2", "pB3", "pB4", "pB5", "pB6", "pB7", "pB8"},
            {"tB1", "cB1", "aB1", "rB1", "rB2", "aB2", "cB2","tB2"}
        }; 
        
        
        
        do{
            
            System.out.println("[1] Negras");
            System.out.println("[2] Blancas");
            System.out.println("[0] Salir");
            System.out.print("Eleccion: ");
            opcion = sc.nextLine(); 
            
            do{
                System.out.print("Dime la x: ");
                int x = sc.nextInt(); 
                System.out.print("Dime la y: ");
                int y = sc.nextInt(); 
                
                Iterator<Pieza> it = blancas.iterator(); 
                while(it.hasNext()){
                    Pieza pi = it.next(); 
                    
                }
            }while(ganador(tablero) == 0); 
            
        }while(!(opcion.equals("0"))); 
        
    }
}
