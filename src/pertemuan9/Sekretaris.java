/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author ConlyAriella
 */
public class Sekretaris extends Pegawai implements dapatMenari{
    int jmlhHadir, Hadir;
    public Sekretaris() {
        Hadir = 15000;
    }
    @Override
    int hitGaji() {
        return Gapok + (Hadir * jmlhHadir);
    }
    @Override
    public String menari(){
        return "Dapat menari jaipong";
    }
}
