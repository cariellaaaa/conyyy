/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author ConlyAriella
 */
public class Sekretaris extends Pegawai{
    int jmlhHadir, Hadir;
    public Sekretaris() {
        Hadir = 15000;
    }
    @Override
    int hitGaji() {
        return GajiPokok + (Hadir * jmlhHadir);
    }
}

