/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      double celsius;
      double fahrenheit; 
      
      System.out.println("Porfavor ingresar un numero para Fahrenheit");
      fahrenheit = entrada.nextDouble();
      
      celsius = (fahrenheit-32)*5/9;
      
      System.out.println("Sus grados en Celsius son: " +celsius + "grados");
              
              
        
    }
    
}
