/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar.dao;
import fajar.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
     List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("2101092001","001","31 Des 2022","2 Jan 2023"));
        data.add(new Peminjaman("2101092001","002","31 Des 2022","2 Jan 2023"));
        data.add(new Peminjaman("2101092001","003","31 Des 2022","2 Jan 2023"));
    }
    
    public Peminjaman save(Peminjaman peminjaman) {
        data.add(peminjaman);
        return peminjaman;
    }
    
    public Peminjaman update(int index, Peminjaman peminjaman) {
        data.set(index, peminjaman);
        return peminjaman;
    }
    
    public Peminjaman delete(int index) {
        return data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index) {
        return data.get(index);
    }
    
    public List<Peminjaman> getAllPeminjaman() {
        return data;
    }
}
