/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba;

/**
 *
 * @author windows
 */
class main {
     public static void main(String[] args){
        //Membuat Instance dari KelasLuar
        KelasLuar outerclass = new KelasLuar();
        //Membuat Instance dari KelasDalam (Mobil)
        KelasLuar.Mobil data1 = outerclass.new Mobil();
        //Membuat Instance dari KelasDalam (Pengguna)
        KelasLuar.Pengguna data2 = outerclass.new Pengguna();
        
        //Menampilkan Hasil Output
        System.out.println("===== DATA DARI CLASS MOBIL ========");
        data1.jalankan();
        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }
}
