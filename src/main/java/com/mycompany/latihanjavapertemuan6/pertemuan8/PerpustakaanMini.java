/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6;
import java.util.Scanner;
/**
 *
 * @author Lintang
 */
public class PerpustakaanMini {

    static void tampilDaftarBuku() {
        String[] buku = {"Laskar Pelangi", "Filosofi Teras", "Bumi", "Negeri 5 Menara", "Atomic Habits"};
        System.out.println("=== DAFTAR BUKU TERSEDIA ===");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i + 1) + ". " + buku[i]);
        }
        System.out.println("============================");
    }

    static boolean cariBuku(String judul) {
        String[] daftarBuku = {"Laskar Pelangi", "Filosofi Teras", "Bumi", "Negeri 5 Menara", "Atomic Habits"};
        for (String b : daftarBuku) {
            if (b.equalsIgnoreCase(judul)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilDaftarBuku();

        System.out.print("Masukkan judul buku yang dicari: ");
        String judulCari = input.nextLine();

        if (cariBuku(judulCari)) {
            System.out.println("Buku tersedia");
        } else {
            System.out.println("Buku tidak ditemukan");
        }

        input.close();
    }
}