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
public class Mamalia extends MakhlukHidup{
    String nama;
    int jmlKaki;
    String suara;

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    String KelasMH(){
        return nama + " adalah mamalia";
    }      
    String bernapas() {
        return "Mamalia bernapas dengan paru-paru";
    }
    
    
    
}
