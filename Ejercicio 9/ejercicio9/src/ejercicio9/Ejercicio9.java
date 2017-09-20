/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio9 
{

    /**
     * @param args the command line arguments
     *  Se ingresa la cantidad y precio de un producto y se informa el total a
     * pagar.
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String datoAux;
        String nombre;
        int cantidad;
        Double precio;
        Double total;
        
        Scanner traerDato= new Scanner (System.in);
        
        System.out.println("Cantidad del preducto:");
        datoAux= traerDato.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Precio del Producto:");
        datoAux= traerDato.next();
        precio= Double.parseDouble(datoAux);
        
        total= cantidad*precio;
        System.out.println("El total a pagar es:"+total);
    }
    
}
