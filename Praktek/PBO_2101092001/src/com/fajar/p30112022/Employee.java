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
public class Employee extends Person{
    public String getName(){ 
        super.name="Dodi";
        System.out.println("Employee Name:" + name); 
      return name;
    } 
}
