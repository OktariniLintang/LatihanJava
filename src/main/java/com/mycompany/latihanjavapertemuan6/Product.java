/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6;

/**
 *
 * @author Lintang
 */
public class Product {
    // 1. Atribut private
    private String namaProduk;
    private double harga;
    private int stok;

    // 2. Buat Constructor
    public Product(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // 3. Buat Getter untuk semua atribut
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // 4. Buat Setter hanya untuk stok
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }

    // 5. Method tambahStok dan kurangiStok (Logika: tidak boleh < 0)
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("Stok " + namaProduk + " bertambah. Total: " + this.stok);
        }
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && (this.stok - jumlah) >= 0) {
            this.stok -= jumlah;
            System.out.println("Stok " + namaProduk + " berkurang. Sisa: " + this.stok);
        } else {
            System.out.println("Gagal mengurangi! Stok tidak mencukupi atau jumlah tidak valid.");
        }
    }
}