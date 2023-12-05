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
public class GajiSekretaris extends GajiKaryawan {
    int Hadir, jmlhHadir;
    
    public GajiSekretaris(){
        Hadir = 15000;
    } 
    public void setJmlhHadir(int jmlHadir) {
        this.jmlhHadir = jmlhHadir;
    }

    @Override
    int hitGaji(){
        Gatot = Gapok + (Hadir * jmlhHadir);
        return Gatot;
    }   
    
}
