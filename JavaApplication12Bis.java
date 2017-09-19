/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12.bis;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication12Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux; 
        String nombre;
        Integer importe;
        Integer impuesto;
        Integer impTotal;
        
        
        Scanner traerDato= new Scanner(System.in);
        
        System.out.println("importe producto:");
        datoAux= traerDato.next();
        importe= Integer.parseInt(datoAux);
        
        impuesto= importe*35/100;
        
        impTotal= importe-impuesto;
        System.out.println( "El importe mas el 35% de impuestos es de:"+
        impTotal )
        
       
        
        

        
        
        
       
        
        
    }
    
}
