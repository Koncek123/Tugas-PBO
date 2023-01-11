/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar.controller;
import fajar.dao.PeminjamanDaoImpl;
import fajar.dao.PeminjamanDao;
import fajar.view.FormPeminjaman;
import fajar.model.*;
import fajar.dao.AnggotaDaoImpl;
import fajar.dao.AnggotaDao;
import fajar.dao.BukuDaoImpl;
import fajar.dao.BukuDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman=formPeminjaman;
        peminjamanDao= new PeminjamanDaoImpl();
        anggotaDao= new AnggotaDaoImpl();
        bukuDao= new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglPeminjaman().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboNobp().removeAllItems();
        List<Anggota> list=anggotaDao.getAllAnggota();
        for (Anggota anggota: list){
            formPeminjaman.getCboNobp(). addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    public void setCboKodeBuku(){
        formPeminjaman.getCboKodeBuku().removeAllItems();
        List<Buku> list=bukuDao.getAllBuku();
        for (Buku buku: list){
            formPeminjaman.getCboKodeBuku(). addItem(buku.getKodeBuku());
        }
    }
    public void save(){
        peminjaman= new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getCboNobp().getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodeBuku(formPeminjaman.getCboKodeBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Entri data Ok");
    }
    
    public void getPeminjaman(){
        int index= formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman=peminjamanDao.getPeminjaman(index);
        if(peminjaman !=null){
           List<Anggota> listAnggota= anggotaDao.getAllAnggota();
           for (Anggota anggota:listAnggota){
               if(peminjaman.getNobp()==anggota.getNobp()){
                   formPeminjaman.getCboNobp().setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                   break;
               }
           }
       }
    }
    public void updatePeminjaman(){
        int index= formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(formPeminjaman.getCboNobp().getSelectedItem().toString().split("-")[0]);
        peminjaman.setKodeBuku(formPeminjaman.getCboKodeBuku().getSelectedItem().toString());
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update OK");
    }
    
    public void deletePeminjaman(){
        int index= formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete OK");
    }
    public void tampilData(){
        DefaultTableModel tabelModel=
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> listPeminjaman= peminjamanDao.getAllPeminjaman();
        for (Peminjaman peminjaman: listPeminjaman) {
            Object[] data={
                peminjaman.getNobp(),
                peminjaman.getKodeBuku(),
                peminjaman.getTglPinjam(),
                peminjaman.getTglKembali()
            };
            tabelModel.addRow(data);
        }
    }
}
