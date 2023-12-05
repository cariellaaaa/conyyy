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
public class PersegiPanjang {
    //atribut
    int p, l, luas, keliling;
    
    //menthod
    int hitLuas(){
        luas = p*l;
        return luas;
    }
    int hitKeliling(){
        keliling = 2 * (p+l);
        return keliling;
    }
    
    //konstruktor
//    public PersegiPanjang(){
//        p = 10;
//        l = 8;
//    }
}
