/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerccio.pkg15;
import java.util.Scanner

/**
 *
 * @author Valeria
 */
public class Ejerccio15 {

    /**
     * @param args the command line arguments
     * se ingresa un importe, si supera los 100 pesosse le suma un 23 %
     * si es menor a 100 pesos, se le descuenta el 20%
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner traerDato=new Scanner(System.in);
        
        int imp;
        int impUno;
        int impDos;
        int descUno;
        int descDos;
        
        System.out.println("ingresar importe:");
        imp= traerDato.nextInt();
        
        descUno= imp*23/100;
        impUno= imp+ descUno;
        
        descDos=imp*20/100;
        impDos=imp- descDos;
        
        if(imp>100)
        {
            System.out.println("Importe:"+impUno);
        }
         else if(imp<100)
             {
                System.out.println("Importe"+impDos);
             }
        
    }
        
        
    }
    
}
