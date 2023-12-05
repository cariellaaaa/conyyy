/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

import Pertemuan6.*;

/**
 *
 * @author raph
 */
public class Sekretaris extends Pegawai{
    String Pengalaman;
    int jmlhHadir,Hadir;

    public Sekretaris() {
        Hadir = 15000;
    }
    
    @Override
    int hitGaji() {
        return GajiPokok + (Hadir * jmlhHadir);
    }
}
