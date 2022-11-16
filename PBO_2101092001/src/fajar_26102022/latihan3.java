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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan3 {
    public static void main(String[] args) {
        int [] angka= new int[10];
     
        int max=-999;
        BufferedReader dataIn= new BufferedReader (new InputStreamReader(System.in));
    
        System.out.println("Input nilai array");
        for (int i = 0; i < angka.length; i++) {
            try {
                System.out.print("Input nilai angka ke- "+(i+1)+": ");
                angka[i]= Integer.parseInt(dataIn.readLine());
            } catch (IOException e) {
                System.out.println("Error!");
            }
        }
        
        System.out.println("Output");
        for (int i = 0; i < angka.length; i++){
           System.out.print(angka[i]+"\t");
        }
        
        for (int i = 0; i < angka.length; i++) {
              if (angka[i]>max){
                    max=angka[i];
              }
        }
        
        System.out.println("\nAngka Terbesar: "+max);
    }
}
