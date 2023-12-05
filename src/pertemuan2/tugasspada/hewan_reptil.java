/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2.tugasspada;

/**
 *
 * @author ConlyAriella
 */
public class hewan_reptil {
    int berat, panjang;
    String warna, kelamin, kulit;
    
    //method
    String berjemur(){ //non void
        return"Buaya biasa berjemur di bawah sinar matahari";
        
    }
    void berenang(){ //void
        System.out.println("buaya berenang di rawa-rawa");
    }
    //konstraktor
    public hewan_reptil (){
        this.berat = 1200;
        this.panjang = 5;
        this.warna = "hijau tua";
        this.kelamin = "betina";
        this.kulit = "bersisik";
    }
     
}
