/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Scanner;


public class Problema4 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        int PartidosGanados, PartidosPerdidos, PartidosEmpatados, PuntajeTotal;
        
        System.out.println("Ingresa el numero de partidos ganados: ");
        PartidosGanados = entrada.nextInt();
        
        System.out.println("Ingresa el numero de partidos perdidos: ");
        PartidosPerdidos = entrada.nextInt();
        
        System.out.println("Ingresa el numero de partidos empatados: ");
        PartidosEmpatados = entrada.nextInt();
        
        PuntajeTotal = (PartidosGanados*3) + (PartidosPerdidos*0) + (PartidosEmpatados*1);
        
        System.out.println("El puntaje total es de: " + PuntajeTotal + " puntos");
        
        
        
        
                
                
        
    }
    
}
