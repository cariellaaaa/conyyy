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
public class Driver_Manajer {
    public static void main(String[] args) {
        Manajer obj = new Manajer();
        obj.nama = "Conly Ariella Masangin";
        obj.Alamat = "Malang";
        obj.Pendidikan = "S2";
        obj.jmlHadir = 30;
        obj.jmlLembur = 25;
        
        System.out.println("Nama : "+obj.nama);
        System.out.println("Alamat : "+obj.Alamat);
        System.out.println("Pendidikan : "+obj.Pendidikan);
        System.out.println("Jumlah Hadir : "+obj.jmlHadir + " Hari");
        System.out.println("Jumlah Lembur : "+obj.jmlLembur + " Jam");
        System.out.println("Gaji : "+obj.HitGaji());
    }

}
