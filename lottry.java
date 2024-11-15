/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goldennumber;

import java.util.Scanner;

/**
 *
 * @author Matiullah Nasiri
 */
public class GoldenNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int goldenNumber1=(int)(Math.random()*10);
        int goldenNumber2=(int)(Math.random()*10);
        System.out.println("guess number 1 :");
        double guess1= input .nextDouble();
        System.out.println("guess number 2");
        double guess2=input.nextDouble();
        if (guess1==goldenNumber1 && guess2==goldenNumber2){
            System.out.println("you win 10_000$");
        }else if (guess1==goldenNumber2 && guess2==goldenNumber1){
            System.out.println("you win 3_000$");
        }else if (guess1==goldenNumber2 ^ guess2==goldenNumber1){
            System.out.println("you win 1_000$");
    }else if (guess1!=goldenNumber2 && guess2!=goldenNumber1){
            System.out.println("you lose !!!");}
            System.out.println("the golden numbers are:  " +goldenNumber1+""+goldenNumber2);
            
    }}