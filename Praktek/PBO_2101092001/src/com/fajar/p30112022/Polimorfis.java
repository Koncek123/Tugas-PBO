/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.p30112022;

/**
 *
 * @author ACER
 */
public class Polimorfis {
    public static void main(String[] args) {
        Person ref;
        student student= new student();
        Employee employee= new Employee();
        
        ref= student;
        String name= ref.getName();
        System.out.println(name);
        //
        ref=employee;
        String name1= ref.getName();
        System.out.println(name1);
        printInformation(student);
        printInformation(employee);
    }
    public static void printInformation(Person person){
        if (person instanceof student){
            System.out.println("Nama student"+person.getName());
        }
        else if (person instanceof Employee){
            System.out.println("Nama employee: "+person.getName());
        }
    }
}
