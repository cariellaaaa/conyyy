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
public class Sekretaris extends Pegawai {
    String pengalaman;
    int jmlHadir, Hadir;

    public Sekretaris() {
        Hadir = 15000;
    }
    
    @Override
    int HitGaji(){
        return Gapok + (Hadir * jmlHadir);
    }
}

    
