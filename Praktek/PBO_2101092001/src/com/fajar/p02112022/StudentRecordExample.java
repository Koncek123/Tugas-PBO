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
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1= new StudentRecord();
        student1.setName("Ali");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setMathGrade(80);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(90);
        
        System.out.println("Nama : "+student1.getName());
        System.out.println("Alamat : "+student1.getAddress());
        System.out.println("Umur : "+student1.getAge());
        System.out.println("MTK : "+student1.getMathGrade());
        System.out.println("B.Inggris : "+student1.getEnglishGrade());
        System.out.println("IPA : "+student1.getScienceGrade());
        System.out.println("Rata-rata : "+student1.getAverage());
        System.out.println("Maximum : "+student1.getMaximum());
        
        StudentRecord student2= new StudentRecord();
        student2.setName("Fajar");
        student2.setAddress("Padang");
        student2.setAge(20);
        student2.setMathGrade(80);
        student2.setEnglishGrade(90);
        student2.setScienceGrade(85);
        student2.print("");
        student2.print(student2.getEnglishGrade(),student2.getMathGrade(),student2.getScienceGrade());
    }
}
