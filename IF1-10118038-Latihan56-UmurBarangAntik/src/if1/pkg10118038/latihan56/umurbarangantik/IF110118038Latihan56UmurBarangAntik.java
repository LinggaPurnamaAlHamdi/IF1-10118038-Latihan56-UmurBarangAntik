/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan56.umurbarangantik;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan informasi Barang Antik
 */
public class IF110118038Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}
