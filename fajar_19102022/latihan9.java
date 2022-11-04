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
public class latihan9 {
    public static void main(String[] args) {
        BufferedReader dataIn= new BufferedReader (new InputStreamReader(System.in));
        
        int angka=0,pangkat=0,kali;
        
        try {
            System.out.print("Input nilai angka: ");
            angka= Integer.parseInt(dataIn.readLine());
            System.out.print("Input nilai pangkat: ");
            pangkat= Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
        kali=1;
        
        for (int i = 1; i <= pangkat; i++) {
            kali=kali*angka;
        }
        System.out.println("Hasil "+angka+ " pangkat "+pangkat+" = "+kali);
    }
}
