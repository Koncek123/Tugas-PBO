/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar_19102022;

/**
 *
 * @author ACER
 */
import javax.swing.JOptionPane;
public class latihan6 {
    public static void main(String[] args) {
        int n1=0,n2=0,n3=0;
        String msg="";
        float rata;
        
        n1= Integer.parseInt(JOptionPane.showInputDialog("Input nilai 1"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Input nilai 2"));
        n3= Integer.parseInt(JOptionPane.showInputDialog("Input nilai 3"));
        
        rata=(n1+n2+n3)/3;
        
        if (rata>=60) {
            msg=":D";
        } else {
            msg=":(";
        }
        
        JOptionPane.showMessageDialog(null,"Rata-rata: "+rata+"\n"+msg);
    }
}
