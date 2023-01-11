/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.p02112022;

/**
 *
 * @author ACER
 */
public class StudentRecord2 {
    public static void main(String[] args) {
        StudentRecord test= new StudentRecord();
        
        test.setName("Fajar");
        System.out.println(test.getName());
        System.out.println("Jumlah nama: "+StudentRecord.getStudentCount());
    }
}


