/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

import pertemuan7.*;

/**
 *
 * @author raph
 */
public class Mamalia extends MahlukHidup implements DapatKomunikasiTelevisi{
    int jmlKaki;
    String Suara;
    String test;

    public Mamalia() {
        nama = "Kuda";  
    }
   
    @Override
    String bernafas() {
        return "Bernafas menggunakan Paru - Paru";
    }
    
    @Override
    public String TekanPower(){
        return "Tekan tmbol dengan simbol bergaris tengah";
    }
     @Override
    public String TekanVolume(){
        return "Tekan tmbol dengan simbol segitiga";
    }
     @Override
    public String TekanChannel(){
        return "Tekan tmbol dengan simbol angka";
    }
    
    
}
