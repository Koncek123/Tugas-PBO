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
public class ContohArgument {
    public static void main(String[] args) {
        try{
            System.out.println("Argumen ke-0: "+args[0]);
        }
        catch(Exception ex){
            System.out.println("Error! Argument "+ex+"Tidak ditemukan");
        }
    }
}
