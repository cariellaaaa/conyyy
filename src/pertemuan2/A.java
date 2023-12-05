/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author ConlyAriella
 */
public class A {
    public static void main(String[] args) {
        KendaraanBermotor MobilA = new KendaraanBermotor ();
        MobilA.jmlhRoda = 10;
        
        MobilA.setJudul();
        System.out.println("jumlah roda = "+MobilA.jmlhRoda);
        System.out.println("jenis BBM = "+MobilA.bahanbakar);
        System.out.println("berat kendaraan = "+MobilA.berat);
        System.out.println("merk = "+MobilA.merk);
        System.out.println("warna kendaraan = "+MobilA.warna);
    }
    
}
