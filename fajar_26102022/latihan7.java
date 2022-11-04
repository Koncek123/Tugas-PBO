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
public class latihan7 {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        
        int tambah,kurang,kali,bagi;
        
        tambah= a+b;
        kurang= a-b;
        kali= a*b;
        bagi= a/b;
        
        System.out.println("Tambah : "+tambah);
        System.out.println("Kurang : "+kurang);
        System.out.println("Kali : "+kali);
        System.out.println("Bagi : "+bagi);
    }
}
