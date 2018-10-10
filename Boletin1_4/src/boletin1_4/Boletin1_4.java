/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       float suma, resta, multiplicacion, division;
       System.out.println("teclea 1º numero");
       float num1=ler.nextFloat();
       System.out.println("teclea 2º numero");
       float num2=ler.nextFloat();
       suma=num1+num2;resta=num1-num2;multiplicacion=num1*num2;division=num1/num2;
       System.out.println("las operaciones son \n suma="+ suma +"\n resta="+resta+"\n multiplicacion="+multiplicacion+"\n division="+division); 
       
       
    }
    
}
