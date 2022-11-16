/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar_26102022;

/**
 *
 * @author ACER
 */


public class latihan4 {
    public static void main(String[] args) {
       String entity [][]= {{"Florence", "735-1234", "Manila"},{"Joyce", "983-3333", "Quezon City"},{"Becca","456-3322", "Manila"}};
        for (int i = 0; i < entity.length; i++) {
            System.out.println("Name : "+entity[i][0]);
            System.out.println("Tel : "+entity[i][1]);
            System.out.println("Address : "+entity[i][2]+"\n");
        }
    }
    
}
