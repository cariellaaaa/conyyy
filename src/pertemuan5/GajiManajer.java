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
public class GajiManajer extends GajiKaryawan{
    int Lembur, Hadir, jmlhHadir, jmlhLembur;
    
    public GajiManajer() {
        Hadir = 15000;
        Lembur = 60000;
    }
    
    public void setJmlhHadir(int jmlhHadir) {
        this.jmlhHadir = jmlhHadir;
    }
    
    public void setJmlhLembur(int jmlhLembur) {
        this.jmlhLembur = jmlhLembur;
    }
    
    //method hitung gajiManager
    @Override
    int hitGaji(){
        Gatot = Gapok + (Hadir * jmlhHadir) + (Lembur * jmlhLembur);
        return Gatot;
    }

    
}
