/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opakování.if_02;

import java.util.Scanner;

/**
 *
 * @author tomas.kubacek
 */
public class OpakováníIf_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner vstup = new Scanner (System.in);
        System.out.print("Zadej číslo a:");
        int a = vstup.nextInt();
        System.out.print("Zadej číslob: ");
        int b = vstup.nextInt();
        //prohodit proměnné, pokud jsou hodnoty obráceně
        if (a > b){
              
            int pomocná = a;
            a = b;
            b = pomocná;
            
        }
        System.out.println("Čísla podle pořadí: "+a+""+b);
        
    }     // TODO code application logic here
}
