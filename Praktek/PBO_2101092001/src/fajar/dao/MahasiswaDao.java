/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar.dao;

/**
 *
 * @author ACER
 */
import fajar.model.Mahasiswa;
import java.util.List;

public interface MahasiswaDao {
    Mahasiswa save(Mahasiswa mahasiswa);
    Mahasiswa update(int index, Mahasiswa mahasiswa);
    Mahasiswa delete(int index);
    Mahasiswa getMahasiswa(int index);
    List<Mahasiswa>getAllMahaiswa();
}
