/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar_19102022;

/**
 *
 * @author ACER
 */

import	java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner In= new Scanner(System.in);
        int grade;
        System.out.print("Input nilai: ");
        grade = In.nextInt();
        if (grade >= 90)
        {
            System.out.println("Excellent!");
        }
        else if( (grade < 90) && (grade >= 80))
        { 
               System.out.println("Good job!" ); 
        } 
        else if( (grade < 80) && (grade >= 60))
        { 
               System.out.println("Study harder!" ); 
        } 
        else
        { 
               System.out.println("Sorry, you failed."); 
        } 

    }
}
