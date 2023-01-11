/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.p21092022;

/**
 *
 * @author ACER
 */
public class Latihan3Fajar {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        int terbesar;
        
        terbesar= (n1>n2)?n1:n2;
        terbesar= (terbesar>n3)?terbesar:n3;
        
        System.out.println("Nila Terbesar = "+terbesar);
    }
}
