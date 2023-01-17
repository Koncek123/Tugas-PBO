/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar_26102022;

/**
 *
 * @author ACER
 */
public class latihan2 {
    public static void main(String[] args) {
      System.out.println("For-loop");
        String days[]= {"Minggu","Senin","Selasa","Rabu","Kamis",
                         "Jum'at","Sabtu"};
        
        for (int i=0;i<days.length;i++){
            System.out.print(days[i]+"\t");
        }
        
        System.out.println("\nWhile-loop");
        int j;
        String day [] = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday\n"};
        j=0;
        while(j<day.length){
            if(j!=0){
                System.out.print(", ");
            }
            System.out.print(day[j]);
            j++;      
    }
}
