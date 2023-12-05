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
public abstract class Pegawai {
    String nama;
    String Alamat;
    int Gapok;
    
    public Pegawai(){
        Gapok = 3200000;
    }
   //method --> deklarasi method tanpa statamentnya
    abstract int HitGaji();
}
