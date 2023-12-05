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
public class Driver_Karyawan {
    public static void main(String[] args) {
        Karyawan obj = new Karyawan();
        obj.nama = "Conly Ariella Masangin";
        obj.Alamat = "Malang";
        obj.keahlihan = "Data Annalys";
        
        System.out.println("Nama : "+obj.nama);
        System.out.println("Alamat : "+obj.Alamat);
        System.out.println("Keahlian : "+obj.keahlihan);
        System.out.println("Gaji : "+obj.HitGaji());
    }

}
