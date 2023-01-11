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
public class OverrideStudent extends StudentRecord{
    
    @Override
    public String getName(){
        System.out.println("Adalah seorang siswa");
        return name;
    }
}
