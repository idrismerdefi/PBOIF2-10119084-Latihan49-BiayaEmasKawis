/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan49.biayaemaskawis;
/**
Nama : Muhammad Idris Merdefi
Kelas : PBOIF2
NIM : 10119084
Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan emas
 */
import java.util.Scanner;
public class PBOIF210119084Latihan49BiayaEmasKawis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Emas emasKawin = new Emas();
        
        System.out.println("====Program Hitung Emas Kawin====");
        System.out.print("Masukkan harga emas pergram = Rp. ");
        emasKawin.setHargaPerGram(scanner.nextDouble());
        System.out.print("Masukkan berat (gram) = ");
        emasKawin.setBerat(scanner.nextDouble());
        
        System.out.println("Total yang harus dibayar = Rp. "
                + emasKawin.hitungTotalHarga());
    }
    
}
