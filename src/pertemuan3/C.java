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
public class C {
    public static void main(String[] args) {
        PersegiPanjang obj = new PersegiPanjang();
                obj.p = 7;
                obj.l = 3;
                int luasalas = obj.hitLuas();
                
                obj.p = 7;
                obj.l = 1;
                int luassamping = 2 * (obj.hitLuas());
                
                obj.p = 3;
                obj.l = 1;
                int luasdepan = 2 * (obj.hitLuas());
                
                int luastotal = luasalas + luassamping + luasdepan;
                System.out.println("Luss total permukaan = " + luastotal + " m²" );
                int luaskeramik = 50 * 50;
                double jumlahKeramik = (luastotal * 10000)/luaskeramik;
                System.out.println("Jumlah keramik = " + jumlahKeramik + " keping");
    }
    
}
