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


public class penjualan {
    public static void main(String[] args) {
        proses_penjualan barang1= new proses_penjualan();
        
        barang1.setNoFaktur("001");
        barang1.setPelanggan("Fajar");
        barang1.setKode_barang("B001");
        barang1.setHarga(65000);
        barang1.setJumlah(1);
        
        System.out.println("No Faktur : "+barang1.getNoFaktur());
        System.out.println("Nama Pelanggan : "+barang1.getPelanggan());
        System.out.println("Kode barang : "+barang1.getKode_barang());
        System.out.println("Harga : "+barang1.getHarga());
        System.out.println("Jumlah : "+barang1.getJumlah());
        System.out.println("Total : "+barang1.getTotal());
        System.out.println("Diskon : "+barang1.getDiskon());
        
    }
}
