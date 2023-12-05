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
public class B {
    public static void main (String[] args){
        Kolam KL = new Kolam();
        KL.p = 20;
        KL.l = 10;
        KL.t = 2;
        System.out.println("Panjang = " + KL.p + " m");
        System.out.println("Lebar = " + KL.l + " m");
        System.out.println("Tinggi = " + KL.t + " m");
        System.out.println("Volume Kolam = " + KL.hitVolume() + " m²");
        System.out.println("Volume Kolam = " + KL.volume * 10000 + " liter");
    }
}
