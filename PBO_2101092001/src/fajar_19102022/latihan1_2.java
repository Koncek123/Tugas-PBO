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
public class latihan1_2 {
    public static void main(String[] args) {
        int grade=0;
        
        String msg="";
        
        grade= Integer.parseInt(JOptionPane.showInputDialog("Input nilai"));
        
        if (grade >= 90)
        {
            msg= "Excellent!";
        }
        else if( (grade < 90) && (grade >= 80))
        { 
            msg= "Good job!";
        } 
        else if( (grade < 80) && (grade >= 60))
        { 
            msg= "Study harder!"; 
        } 
        else
        { 
            msg= "Sorry, you failed.";
        }
        
        JOptionPane.showMessageDialog(null,"NIlai anda "+grade+"\n"+msg);
    }
}
