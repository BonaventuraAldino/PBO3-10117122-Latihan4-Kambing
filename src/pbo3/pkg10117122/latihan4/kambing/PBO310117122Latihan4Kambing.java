/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan4.kambing;

/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * 
 */
public class PBO310117122Latihan4Kambing {

    public void tambahKambing() {
       // Deklarasi variabel lokal
       int jumlahKambing = 0;
       
       jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        PBO310117122Latihan4Kambing kambingJantan;
        kambingJantan = new PBO310117122Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
}
