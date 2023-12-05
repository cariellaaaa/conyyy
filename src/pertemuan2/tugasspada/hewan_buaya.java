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
public class hewan_buaya {
    public static void main(String[] args) {
        hewan_reptil Buaya = new hewan_reptil();
        
        Buaya.berenang();
        System.out.println("berat buaya (kg)   : "+Buaya.berat);
        System.out.println("panjang buaya (m)) : "+Buaya.panjang);
        System.out.println("warna buaya : "+Buaya.warna);
        System.out.println("kelamin buaya : "+Buaya.kelamin);
        System.out.println("kulit buaya : "+Buaya.kulit);
        
        
    }
    
}
