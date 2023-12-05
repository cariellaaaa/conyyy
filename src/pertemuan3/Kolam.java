/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author ConlyAriella
 */
public class Kolam extends PersegiPanjang {
    
    //atribut
    int t, volume;
    
    //method
    int hitVolume(){
        volume = hitLuas()*t;
        return volume;
    }
    
    //konstruktor
//    public Kolam(){
//        p = 5;
//        l = 3;
//        t = 2;
//    }
    
}
