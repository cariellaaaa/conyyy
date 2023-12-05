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
public class pisces extends MakhlukHidup {
    String nama;
    int jmlhsirip;
    int bentuk_ekor;
    
 //   public void setNama(String nama) {
 //       this.nama = nama;
 //   }
    
    public pisces(){
        nama = "Gurami";
    }

    @Override
    String KelasMH(){
        return nama + " adalah Pisces";
    }      
    String bernapas(){
        return "bernapas dengan insang";
    }
    
}
