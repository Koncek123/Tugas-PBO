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
public class proses_latihan1 {
    private String nama;
    private String alamat;
    private String nomor;
    private String email;
    
    public proses_latihan1(){
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public void setNomor(String nomor){
        this.nomor=nomor;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getNomor(){
        return nomor;
    }
    
    public String getEmail(){
        return email;
    }
    
}
