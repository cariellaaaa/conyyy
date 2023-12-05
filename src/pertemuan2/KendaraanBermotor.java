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
public class KendaraanBermotor {
    //atribut
    int jmlhRoda;
    int berat;
    String merk;
    String warna;
    String bentuk;
    String mesin;
    String bahanbakar;
  
    //method
        //non void(function)
           String maju(){
               return"hidupkan mesin, gigi_1, tekan gas";
           }
        //void (procedure)
           void setJudul(){
               System.out.println("belajar java...");
           }
    
    //konstruktor

    public KendaraanBermotor() {
        this.jmlhRoda = 4;
        this.berat = 1250;
        this.merk = "Honda";
        this.warna = "Hitam";
        this.bentuk = "Kubus Berjalan";
        this.mesin = "Manual";
        this.bahanbakar = "Premium";
    }
           
    
}
