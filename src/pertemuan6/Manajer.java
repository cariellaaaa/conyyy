/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author ConlyAriella
 */
public class Manajer extends Pegawai{
    String Pendidikan;
    int jmlLembur,jmlHadir, Hadir, Lembur;

    public Manajer() {
        Hadir = 15000;
        Lembur = 60000;
    }
   
    @Override
    int HitGaji() {
        return Gapok + (Hadir * jmlHadir) + (Lembur * jmlLembur);
    }
    
    
}
