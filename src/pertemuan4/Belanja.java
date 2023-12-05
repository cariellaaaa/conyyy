/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author ConlyAriella
 */
public class Belanja {
    private String kode_pelanggan1, kode_pelanggan2;
    private String input_kode;
    double total_belanja,bayar,totalDisc;
    private double diskon;
    
    public Belanja() {
        this.kode_pelanggan1 = "P001";
        this.kode_pelanggan2 = "G003";
        diskon = 0.0;
    }
    
    public String getInput_kode() {
        return input_kode;
    }

    public void setInput_kode(String inputkode) {
        this.input_kode = inputkode;
    }
    
    double gettotalDisc(){
        totalDisc = bayar * diskon;
        return totalDisc;
    }
    public double getTotal_belanja() {
        return total_belanja = bayar - totalDisc;
    }
    
    public double cocokkankode() {
        if (kode_pelanggan1.equals(getInput_kode())) {
            diskon = 0.10; // 10% diskon
        } else if (kode_pelanggan2.equals(getInput_kode())) {
            diskon = 0.15; // 15% diskon
        }
        return diskon;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
//    String belanja;
//    private String kode_pelanggan1, kode_pelanggan2;
//    private String Data;
//    String hasilbelanja;
//    
//    public Belanja(){
//        belanja = "500000";
//    }
//
//    public String getKode_pelanggan() {
//        return kode_pelanggan1 = "P001";
//    }
//
//    public void setKode_pelanggan(String kode_pelanggan) {
//        this.kode_pelanggan = kode_pelanggan;
//    }
//    
//    
//
////    public void setKode_pelanggan(String kode_pelanggan) {
////        this.kode_pelanggan = kode_pelanggan;
////    }
//
//    public void setData(String Data) {
//        this.Data = Data;
//    }
//    
//    
////    String cocokanKode(){
////        if(kode_pelanggan.compareTo(Data) == 001){
////            hasilbelanja = "0,1";
////            
////        }
////    }
//    public double getHasilBelanja() {
//        double diskon = 0.0;
//        if (kode_pelanggan.equals("P001")) {
//            diskon = 0.10; // 10% diskon
//            //return belanja * diskon;
//        } else if (kode_pelanggan.equals("G003")) {
//            diskon = 0.15; // 15% diskon
//        }
//        return diskon;
//}
