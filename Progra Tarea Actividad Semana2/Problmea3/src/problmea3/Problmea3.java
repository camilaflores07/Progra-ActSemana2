/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problmea3;

import java.util.Scanner;


public class Problmea3 {

   
    public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    
    double Perimetro;
    double Area;
    double Altura;
    double Base;
    
    System.out.println("Digite el numero de una altura: ");
    Altura = entrada.nextDouble();
    
    System.out.println("Digite el numero de una base: ");
    Base = entrada.nextDouble();
    
    Area = (Altura + Base);
    Perimetro = 2*(Altura + Base);
    
    System.out.println("Su perimetro es de " + Perimetro + "y su Area es de " + Area);
    

   
  
   
    
            
            
     
    }
    
}
