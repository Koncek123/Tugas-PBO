/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar.controller;
import fajar.dao.AnggotaDaoImpl;
import fajar.dao.AnggotaDao;
import fajar.view.FormAnggota;
import fajar.model.Anggota;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */

public class AnggotaController {
    private FormAnggota formAnggota;
    private AnggotaDao anggotaDao;
    private Anggota anggota;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota=formAnggota;
        anggotaDao= new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void save(){
        anggota= new Anggota();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Entri data Ok");
    }
    
    public void getAnggota(){
        int index= formAnggota.getTblAnggota().getSelectedRow();
        anggota=anggotaDao.getAnggota(index);
        if(anggota !=null){
            formAnggota.getTxtNobp().setText(anggota.getNobp());
            formAnggota.getTxtNama().setText(anggota.getNama());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
       }
    }
    public void updateAnggota(){
        int index= formAnggota.getTblAnggota().getSelectedRow();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.update(index, anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Update OK");
    }
    
    public void deleteAnggota(){
        int index= formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Delete OK");
    }
    public void tampilData(){
        DefaultTableModel tabelModel=
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Anggota> listAnggota= anggotaDao.getAllAnggota();
        for (Anggota anggota: listAnggota) {
            Object[] data={
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat()
            };
            tabelModel.addRow(data);
        }
    }
}
