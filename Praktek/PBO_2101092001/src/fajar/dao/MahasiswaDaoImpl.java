/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar.dao;
import fajar.model.Mahasiswa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */

public class MahasiswaDaoImpl implements MahasiswaDao{
    List<Mahasiswa> data = new ArrayList<>();

    public MahasiswaDaoImpl() {
        data.add(new Mahasiswa());
        data.add(new Mahasiswa());
        data.add(new Mahasiswa());
    }
    
    @Override
    public Mahasiswa save(Mahasiswa mahasiswa) {
        data.add(mahasiswa);
        return mahasiswa;
    }
    
    public Mahasiswa update(int index, Mahasiswa mahasiswa) {
        data.set(index, mahasiswa);
        return mahasiswa;
    }
    
    public Mahasiswa delete(int index) {
        return data.remove(index);
    }
    
    public Mahasiswa getMahasiswa(int index) {
        return data.get(index);
    }
    
    public List<Mahasiswa> getAllMahasiswa() {
        return data;
    }

    @Override
    public List<Mahasiswa> getAllMahaiswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
