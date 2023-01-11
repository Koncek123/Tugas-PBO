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

class Circle extends Shape {
    private int jari2;
    
    Circle(String aNama) {
        super(aNama);
        jari2= 3;
    }
    
    public float getArea() {
        float area;
        area = (float) (3.14 * jari2 * jari2);
        return area;
    }
}
