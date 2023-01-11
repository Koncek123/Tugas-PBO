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
public class StudentRecord1 {
    public static void main(String[] args) {
        StudentRecord student3 = new StudentRecord("Doni", "padang",19);
        
        student3.print("");
        
        StudentRecord student4= new StudentRecord();
        student4.print("");
        
        StudentRecord student5= new StudentRecord("ani");
        System.out.println("Jumlah siswa "+ StudentRecord.getStudentCount());
        
    }
}
