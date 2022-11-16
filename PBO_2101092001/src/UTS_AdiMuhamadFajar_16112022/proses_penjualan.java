/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_AdiMuhamadFajar_16112022;

/**
 *
 * @author ACER
 */


public class proses_penjualan {
    private String noFaktur;
    private String pelanggan;
    private String kode_barang;
    private int harga;
    private int jumlah;
    private int total;
    private double diskon;
    private double total_seluruh;
    
    public void setNoFaktur(String noFaktur){
        this.noFaktur=noFaktur;
    }
    
    public void setPelanggan(String pelanggan){
        this.pelanggan=pelanggan;
    }
    
    public void setKode_barang(String kode_barang){
        this.kode_barang=kode_barang;
    }
    
    public void setHarga(Integer harga){
        this.harga=harga;
    }
    
    public void setJumlah(Integer jumlah){
        this.jumlah=jumlah;
    }
    
    public void setTotal(Integer total){
        this.total=total;
    }
    
    public void setDiskon(Integer diskon){
        this.diskon=diskon;
    }
    
    public String getNoFaktur(){
        return noFaktur;
    }
    
    public String getPelanggan(){
        return pelanggan;
    }
    
    public String getKode_barang(){
        return kode_barang;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public int getTotal(){
        int t;
        
        t= harga*jumlah;
        return t;
    }
    
    public double getDiskon(){
        double d=0;
        
        if (total > 50000){
            System.out.println("Anda Mendapat diskon 2%");
            d= total*0.02;
            return d;
        }
        
        if (total > 1000000){
            System.out.println("Anda Mendapat diskon 5%");
            d= total*0.05;
            return d;
        }
        
        return d;
    }
    
    public double getTotal_Seluruh(){
        double t1;
        
        t1= total-diskon;
        return t1;
    }
    
}
