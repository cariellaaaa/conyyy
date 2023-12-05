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
public class A {
    
    public static void main(String[] args){
        PersegiPanjang ppl = new PersegiPanjang();
        ppl.p = 25;
        ppl.l = 20;
        System.out.println("Panjang = " + ppl.p);
        System.out.println("Lebar = " + ppl.l);
        System.out.println("Luas = " + ppl.hitLuas());
        System.out.println("keliling =  " + ppl.hitKeliling());
    }
    
}
