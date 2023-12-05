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
public class Manager extends Pegawai implements dapatMemasak, dapatMenari{
    int jmlhLembur,jmlhHadir, Hadir, Lembur;

    public Manager() {
        Hadir = 15000;
        Lembur = 60000;
    }
    @Override
    int hitGaji() {
        return Gapok+ (Hadir * jmlhHadir) + (Lembur * jmlhLembur);
    }
     @Override
    public String Memasak(){
        return "Dapat memasak makananan enak";
    }
    @Override
    public String menari(){
        return "Dapat menari jaipong";
    }
}
