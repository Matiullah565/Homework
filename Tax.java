/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax;

import java.util.Scanner;

/**
 *
 * @author Matiullah Nasiri
 */
public class Tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your income amount");
        double income = input.nextDouble();
        System.out.println("enter type of tax filing:\n a.(1)fcr single. \n b. (2)for maried jontly. \n c. (3)maried seperatly.\n d. (4)for household filing");

        int status = input.nextInt();
        double tax;
        switch (status) {
            case 1:
                if (income >= 0 && income <= 8350) {
                    tax = (income * 10) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 8350 && income <= 33950) {
                    tax = (income * 15) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 33950 && income <= 82250) {
                    tax = (income * 25) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 82250 && income <= 171550) {
                    tax = (income * 28) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 171550 && income <= 372950) {
                    tax = (income * 33) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 372950) {
                    tax = (income * 35) / 100d;
                    System.out.println("your payable tax is : " + tax);
                }
                break;
            case 2:
                if (income >= 0 && income <= 16700) {
                    tax = (income * 10) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 16700 && income <= 67900) {
                    tax = (income * 15) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 67900 && income <= 137050) {
                    tax = (income * 25) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 137050 && income <= 208850) {
                    tax = (income * 28) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 208850 && income <= 372950) {
                    tax = (income * 33) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 372950) {
                    tax = (income * 35) / 100d;
                    System.out.println("your payable tax is : " + tax);
                }
                break;
            case 3:
                if (income >= 0 && income <= 8350) {
                    tax = (income * 10) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 8350 && income <= 33950) {
                    tax = (income * 15) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 33950 && income <= 68525) {
                    tax = (income * 25) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 68525 && income <= 104425) {
                    tax = (income * 28) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 104425 && income <= 186475) {
                    tax = (income * 33) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 186475) {
                    tax = (income * 35) / 100d;
                    System.out.println("your payable tax is : " + tax);
                }
                if (income >= 0 && income <= 8350) {
                    tax = (income * 10) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 8350 && income <= 33950) {
                    tax = (income * 15) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 33950 && income <= 82250) {
                    tax = (income * 25) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 82250 && income <= 171550) {
                    tax = (income * 28) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 171550 && income <= 372950) {
                    tax = (income * 33) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 372950) {
                    tax = (income * 35) / 100d;
                    System.out.println("your payable tax is : " + tax);
                }
                break;
            case 4:
                if (income >= 0 && income <= 11950) {
                    tax = (income * 10) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 11950 && income <= 45500) {
                    tax = (income * 15) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 45500 && income <= 117450) {
                    tax = (income * 25) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 117450 && income <= 190200) {
                    tax = (income * 28) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 190200 && income <= 372950) {
                    tax = (income * 33) / 100d;
                    System.out.println("your payable tax is : " + tax);
                } else if (income > 372950) {
                    tax = (income * 35) / 100d;
                    System.out.println("your payable tax is : " + tax);
                }
        }

    }

}
