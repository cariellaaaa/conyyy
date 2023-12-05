/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author ConlyAriella
 */
public class Gaji {
    
    int Gapok;
    //int T_trans;
    int Hadir;
    int Lembur;
    int total;
    
    public Gaji (){
        Gapok = 3200000;
        //T_trans = 25000;
        Hadir = 15000;
        Lembur = 60000;
    }
    
    int Gaji(){
      //  total = Gapok;
        return Gapok;
    }
    
    int hitGaji(int jmlhHadir){
        total = Gapok + (jmlhHadir * Hadir);
        return total;
    }
    
    
   int hitGaji (int jmlhHadir, int jmlhlembur){
        total= Gapok + (jmlhHadir * Hadir) + (jmlhlembur * Lembur);
        return total;
    }
}
