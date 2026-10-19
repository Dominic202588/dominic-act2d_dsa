/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lumba_program;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class lumba_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //poww
        System.out.println("Hello World!");
        System.out.println("dominic,lumba,A.");
        //rock, papper, and scissors
        System.out.println("[1] - Rock ");
        
        //calculator
        System.out.println("Enter a number:");
        int x = input.nextInt();
        System.out.println("Enter a number:");
        int y = input.nextInt();
        
        int sum,diff,prod,quot;
        sum = x + y;
        diff = x - y;
        prod= x * y;
        quot= x / y;
        System.out.println("sum is:"+sum);
        System.out.println("difference is:"+diff);
        System.out.println("product is:"+prod);
        System.out.println("quotient is:"+quot);
  
    }
}
