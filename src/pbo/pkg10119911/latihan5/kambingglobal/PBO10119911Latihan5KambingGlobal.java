/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10119911.latihan5.kambingglobal;

/**
 * 
 * @author 
 * NAMA     : Mochamad Tegar Dwi S
 * KELAS    : IF10K
 * NIM      : 10119911
 * Deskripsi Program : Kambing
 */
public class PBO10119911Latihan5KambingGlobal {
    
// Variabel jumlahKambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
      
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println(" Jumlah kambing setelah ditambah: " + jumlahKambing);
}
    
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
    // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
    // Menambah satu kambing
        kambingSusu.tambahKambing();
        
    // Menampilka jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
}
    
}
