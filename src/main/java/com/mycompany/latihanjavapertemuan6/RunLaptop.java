/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6;

/**
 *
 * @author Lintang
 */
public class RunLaptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS ROG", 15000000, "Hitam");
        Laptop laptop2 = new Laptop("MacBook Air", 18000000, "Space Grey");

        System.out.println("=== Daftar Laptop ===");
        laptop1.tampilSpek();
        laptop2.tampilSpek();

        int hargaSetelahDiskon = laptop1.diskon(10);
        System.out.println("Promo Diskon 10% untuk " + laptop1.merk + "!");
        System.out.println("Harga akhir: Rp" + hargaSetelahDiskon);
    }
}