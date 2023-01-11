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
class Square extends Shape {
    private int sisi;
    
    Square(String aNama) {
        super(aNama);
        sisi = 3;
    }
    
    public float getArea() {
        int area;
        area = sisi * sisi;
        return area;
    }
}