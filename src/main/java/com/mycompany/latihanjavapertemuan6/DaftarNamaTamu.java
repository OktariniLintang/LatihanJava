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
public class DaftarNamaTamu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int jumlahTamu;
        System.out.print("Masukkan jumlah tamu: ");
        jumlahTamu = scan.nextInt();
        scan.nextLine();

        String[] nama = new String[jumlahTamu];

        for (int i = 0; i < jumlahTamu; i++) {
            System.out.print("Masukkan nama tamu ke-" + (i + 1) + ": ");
            nama[i] = scan.nextLine();
        }

        System.out.println("\nDaftar Nama Tamu:");
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.println("Tamu " + (i + 1) + ": " + nama[i]);
        }

        int jumlahA = 0;

        for (int i = 0; i < jumlahTamu; i++) {
            if (nama[i].startsWith("A")) {
                jumlahA++;
            }
        }

        System.out.println("\nJumlah tamu dengan nama diawali huruf A: " + jumlahA);

        scan.close();
    }
} 