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

public class latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn= new BufferedReader (new InputStreamReader(System.in));
        
        String name="";
        String alamat="";
        String jurusan="";
        
       
        try {
            System.out.print("Input nama: ");
            name= dataIn.readLine();
            System.out.print("Input Alamat: ");
            alamat= dataIn.readLine();
            System.out.print("Input jurusan: ");
            jurusan= dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello "+name+" di "+alamat+" Selamat danatan di "+jurusan);
        
       
    }
}
