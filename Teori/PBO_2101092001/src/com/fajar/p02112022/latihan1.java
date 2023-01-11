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
import java.util.Scanner;


public class latihan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        proses_latihan1 bukuAlamat[] =  new proses_latihan1[100]; 
        
        int n,menu,updt;
        int a,i,del,isi;
        String nama;
        String alamat; 
        String telepon;
        String email;
        
        isi=0;
        
        do{ 
        System.out.print("1.Input Data\n2.Tampilkan Data\n3.Update Data\n4.Hapus Data\n5.Exit");
        System.out.println("\n--------------------------------------------"); 
          
        System.out.print("Masukkan jumlah data : ");
        n = in.nextInt();
        
        System.out.print("Masukkan Menu : ");
        menu=in.nextInt();
                       
        System.out.println("============================================");
        switch(menu){
            case 1 : 
                in.nextLine();
                    for (i=0;i<n;i++){
                    proses_latihan1 bukuAlamat1 = new proses_latihan1();
                    System.out.println("\nData ke-"+(i+1));
                    System.out.print("Masukkan Nama : ");
                    nama = in.nextLine();
                    bukuAlamat1.setNama(nama);

                    System.out.print("Masukkan Alamat : ");
                    alamat = in.nextLine();
                    bukuAlamat1.setAlamat(alamat);

                    System.out.print("Masukkan Telepon : ");
                    telepon = in.nextLine();
                    bukuAlamat1.setNomor(telepon);

                    System.out.print("Masukkan Email : ");
                    email = in.nextLine();
                    bukuAlamat1.setEmail(email);

                    bukuAlamat[i] = bukuAlamat1;
                    isi++;
                }
                System.out.println("============================================");
                System.out.println("");
                break;
                
            case 2 :
                if(isi==0){
                    System.out.println("Data Anda Kosong");
                }
                else if(isi != 0){
                    System.out.print("\t-Data Buku Alamat-");
                    for (i=0;i<n;i++){
                        System.out.println("\nData ke-"+(i+1));
                        System.out.println("Nama : "+bukuAlamat[i].getNama());
                        System.out.println("Alamat : "+bukuAlamat[i].getAlamat());
                        System.out.println("Telepon : "+bukuAlamat[i].getNomor());
                        System.out.println("Email : "+bukuAlamat[i].getEmail());
                    }
                }
                System.out.println("============================================");
                System.out.println("");
                break;
                
            case 3 : System.out.print("Masukkan Data yang ingin di Update : ");
                    updt=in.nextInt();
                    proses_latihan1 bukuAlamat1 = new proses_latihan1();
                    
                    in.nextLine();
                        System.out.println("\nData ke-"+(updt));
                        System.out.print("Masukkan Nama : ");
                        nama = in.nextLine();
                        bukuAlamat1.setNama(nama);

                        System.out.print("Masukkan Alamat : ");
                        alamat = in.nextLine();
                        bukuAlamat1.setAlamat(alamat);

                        System.out.print("Masukkan Telepon : ");
                        telepon = in.nextLine();
                        bukuAlamat1.setNomor(telepon);

                        System.out.print("Masukkan Email : ");
                        email = in.nextLine();
                        bukuAlamat1.setEmail(email);

                        bukuAlamat[updt-1] = bukuAlamat1;
                        System.out.println("============================================");
                        System.out.println("");
                break;
                
            case 4 : in.nextLine();
                     proses_latihan1 bukuAlamat2 = new proses_latihan1();
                     
                     System.out.print("Masukkan Data yang ingin di Hapus : ");
                     del=in.nextInt();
                     
                        bukuAlamat2.setNama("");
                        bukuAlamat2.setAlamat("");
                        bukuAlamat2.setNomor("");
                        bukuAlamat2.setEmail("");

                        bukuAlamat[del-1] = bukuAlamat2;
                        isi--;
                System.out.println("Data indeks "+del+" telah dihapus");
                System.out.println("============================================");
                System.out.println("");
                break;
        }
    }
        while(menu!=5);
        System.out.println("");

    }
}
