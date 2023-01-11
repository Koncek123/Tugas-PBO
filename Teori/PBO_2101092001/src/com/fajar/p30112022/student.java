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
public class student extends Person{
    public student(){
        super("Ali","Padang");
        super.name="ani";
        super.address="someaddress";
        System.out.println("Inside student:Constructor");
    }
    
  
    @Override
    public String getName(){ 
        System.out.println("Parent: getName"); 
        return name; 
    }
    
    public static void main(String[] args) {
        student anna= new student();
        anna.name="Anna";
        System.out.println(anna.name);
    }
}
