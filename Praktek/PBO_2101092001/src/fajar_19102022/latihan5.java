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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class latihan5 {
    public static void main(String[] args) {
        BufferedReader dataIn= new BufferedReader (new InputStreamReader(System.in));
        
        int n1=0,n2=0,n3=0;
        float rata;
        
        try {
            System.out.print("Input nilai 1: ");
            n1= Integer.parseInt(dataIn.readLine());
            System.out.print("Input nilai 2: ");
            n2= Integer.parseInt(dataIn.readLine());
            System.out.print("Input nilai 3: ");
            n3= Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        rata= (n1+n2+n3)/3;
        System.out.print("Rata-rata: "+rata);
        if (rata>=60) {
            System.out.println("\n:D");
        } else {
            System.out.println("\n:(");
        }
    }
}
