/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6;

/**
 *
 * @author Lintang
 */
public class RunProduct {
    public static void main(String[] args) {
        // 1. Membuat objek produk baru (Inisialisasi lewat Constructor)
        Product p1 = new Product("Laptop Gaming", 15000000, 10);

        // 2. Mengakses data menggunakan Getter
        System.out.println("--- Detail Produk ---");
        System.out.println("Nama Produk : " + p1.getNamaProduk());
        System.out.println("Harga       : Rp " + p1.getHarga());
        System.out.println("Stok Awal   : " + p1.getStok());
        System.out.println("---------------------");

        // 3. Mencoba mengubah stok menggunakan Setter
        p1.setStok(15);
        System.out.println("Stok setelah di-set manual: " + p1.getStok());

        // 4. Menambah stok menggunakan method tambahStok
        p1.tambahStok(5); // Stok jadi 20

        // 5. Mengurangi stok menggunakan method kurangiStok
        p1.kurangiStok(7); // Stok jadi 13

        // 6. Uji coba logika validasi (Pengurangan melebihi stok yang ada)
        System.out.println("\nMencoba mengurangi stok secara berlebihan:");
        p1.kurangiStok(50); // Ini akan memicu pesan error karena stok tidak cukup

        // 7. Menampilkan hasil akhir
        System.out.println("\nStok Akhir " + p1.getNamaProduk() + " adalah: " + p1.getStok());
    }
}
