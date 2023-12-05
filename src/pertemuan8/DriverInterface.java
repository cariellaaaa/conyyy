/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8;

/**
 *
 * @author ConlyAriella
 */
public class DriverInterface {
    
    public static void main(String[] args) {
        Mamalia manusia = new Mamalia();
        manusia.nama = "Al";
        System.out.println("nama = "+manusia.nama);
        System.out.println(manusia.bernafas());
        System.out.println("Cara berkomunikasi dengan televisi");
        System.out.println(manusia.TekanPower());
        System.out.println(manusia.TekanVolume());
        System.out.println(manusia.TekanChannel());
        System.out.println(manusia.jmlBateraiRemote);
    }
}