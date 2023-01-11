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

public abstract class Shape {
    private String nama;
    
    Shape(String aNama) {
        nama=aNama;
    }
    
    public String getName() {
        return nama;
    }
    
    public abstract float getArea();
}






