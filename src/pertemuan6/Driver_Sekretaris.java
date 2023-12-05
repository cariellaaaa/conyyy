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
public class Driver_Sekretaris {
    public static void main(String[] args) {
        Sekretaris obj = new Sekretaris();
        obj.nama = "Conly Ariella Masangin";
        obj.Alamat = "Malang";
        obj.pengalaman = "3 Tahun Kerja";
        obj.jmlHadir = 30;
        
        System.out.println("Nama : "+obj.nama);
        System.out.println("Alamat : "+obj.Alamat);
        System.out.println("Pengalaman : "+obj.pengalaman);
        System.out.println("Jumlah Hadir : "+obj.jmlHadir + " Hari");
        System.out.println("Gaji : "+obj.HitGaji());
    }

    
    
}
