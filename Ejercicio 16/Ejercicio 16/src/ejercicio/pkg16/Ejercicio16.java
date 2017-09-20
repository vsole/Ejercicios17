/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;
import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     * se ingresa el importe de un pasaje de avion y el mes de viaje,
     * si es enero, se le descuenta un 10% por temporada baja.
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner traerDato=new Scanner (System.in);
        
        
        int pasaje;
        String mes;
        int valorPasaje;
        int desc;
        
        System.out.println("Valor de pasaje:)");
        pasaje= traerDato.nextInt();
        
        System.out.print("Mes de Viaje:" );
        mes= traerDato.next(); 
        
        desc= pasaje*10/100;
        valorPasaje= pasaje- desc;
        if("enero".equals(mes))    
        { 
            System.out.println("Felicitaciones!! Su pasaje sale:"+valorPasaje);
        }
        else
        {
            System.out.println("Su pasaje sale:"+pasaje);
        }
    }
}
