/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar.dao;
import fajar.model.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("001","Sejarah Alam Minangkabau","xxx","yyy"));
        data.add(new Buku("002","BAM","zzz","aaa"));
        data.add(new Buku("003","IPA","xxx","Tiga Serangkai"));
    }
    
    @Override
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }
    
    public Buku update(int index, Buku buku) {
        data.set(index, buku);
        return buku;
    }
    
    public Buku delete(int index) {
        return data.remove(index);
    }
    
    public Buku getBuku(int index) {
        return data.get(index);
    }
    
    public List<Buku> getAllBuku() {
        return data;
    }
}
