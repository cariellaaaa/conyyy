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
public abstract class Pegawai {
    int GajiPokok;
    public Pegawai(){
        GajiPokok = 3200000;
    }
    abstract int hitGaji();
    
    String Pegawai(Karyawan A){
        return "Jabatan Karyawan";
    }
    String Pegawai(Sekretaris A){
        return "Jabatan Sekretaris";
    }
    String Pegawai(Manager A){
        return "Jabatan Manager";
    }
}

