/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.p05102022;

/**
 *
 * @author ACER
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn= new BufferedReader (new InputStreamReader(System.in));
        
        int n1=0;
        int n2=0;
        int n3=0;
        
       
        try {
            System.out.print("Angka 1: ");
            n1= Integer.parseInt(dataIn.readLine());
            
            System.out.print("Angka 2: ");
            n2= Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Jumlah = "+(n1+n2));
        n3= n1+n2;
        System.out.println("n1: "+n1+"\nn2: "+n2+"\nn3: "+n3);
        
    }
}
