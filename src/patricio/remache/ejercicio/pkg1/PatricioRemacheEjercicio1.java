/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patricio.remache.ejercicio.pkg1;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PatricioRemacheEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("patricio remache");
        System.out.print("area del cuadrado");
        System.out.print ("ingrese el lado des cuadrado");
        double a = s.nextDouble();
        double re = (a*a);
        System.out.println("Area cuadrado es:"+ re );
    }
    
    
}
