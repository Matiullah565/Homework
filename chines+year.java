h
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("please enter a year to cheack its name");
         int year = input.nextInt();
   switch(year%12){
       case 0:
           System.out.println("monkey year");
           break;
           
       case 1:
           System.out.println("rooster year");
           break;
                   case 2:
                       System.out.println("dog  year");
                       break;
                   case 3:
                       System.out.println("pig year");
                       break;
                   case 4:
                       System.out.println("rat year");
                       break;    
                   case 5:
                       System.out.println("ox year");
                       break;           
                   case 6:
                       System.out.println("tigger year");
                       break;
                       case 7:
                       System.out.println("rabbit year");
                      
                       break;
                       case 8:
                       System.out.println("dragon year");
                       break;
                       case 9:
                       System.out.println("snak year");
                       break;
                       case 10:
                     
                       System.out.println("horse year");
   
                       break;
                       case 11:
                       System.out.println("sheep year");
                       break;
                       default:
                           System.out.println("your year is not in list");
                       
                       
    }
   
    }
    
}
