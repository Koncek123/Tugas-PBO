/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.p07122022;

/**
 *
 * @author ACER
 */
public class TestExceptions {
    public static void main( String[] args ){
        try {
            for( int i=0; true; i++ ){
                System.out.println("args["+i+"]="+args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index ke "+ex.getMessage()+" Tidak ditemukan");
        }finally{
            System.out.println("Quiting....");
        }
       
    }
}
