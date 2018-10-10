/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
       double millas,m=1852,metros;
       System.out.println("introduzca millas");
       millas=ler.nextDouble();
       System.out.println(millas + " millas equivale a " + (millas*m)+" metros");
       
       
    }
    
}
