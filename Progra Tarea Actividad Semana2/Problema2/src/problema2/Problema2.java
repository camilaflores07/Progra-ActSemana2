/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import wertcajava.util.Scanner;

public class Problema2 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        String nombre;
        double CalificacionFinal;
        double PromedioParciales;
        double CalExamenFinal;
        double CalTrabajoFinal;
        
        System.out.println("----- Calificaciones Finales ------- ");
        
        System.out.println("Porfavor ingresar nombre del alumno: ");
        nombre = entrada.next();
        
        System.out.println("Ingrese el promedio de sus tres calificaciones parciales: ");
        PromedioParciales = entrada.nextDouble();
        
        System.out.println("Ingrese la calificacion de su examen final: ");
        CalExamenFinal = entrada.nextDouble();
        
        System.out.println("Ingrese la calificacion de su trabajo final: ");
        CalTrabajoFinal = entrada.nextDouble();
        
        CalificacionFinal = (0.55*PromedioParciales)+(0.30*CalExamenFinal)+(0.15*CalTrabajoFinal);
       
        System.out.println("La Calificacion Final del estudiante " +nombre + " es de:" +CalificacionFinal);      
         
         
        
        
        
                
        
        
    }
    
}
