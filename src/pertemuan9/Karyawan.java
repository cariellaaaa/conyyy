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
public class Karyawan extends Pegawai implements dapatMemasak{
    @Override
    int hitGaji() {
        return Gapok;
    }
    @Override
    public String Memasak(){
        return "Dapat memasak makananan enak";
    }
}


