/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanjavapertemuan6;

/**
 *
 * @author Lintang
 */
public class LatihanJavaPertemuan6 {

    public static void main(String[] args) {
        String[] namaBuah = {"Apel", "Jeruk", "Mangga"};
        
        System.out.println("Buah Pertama : " + namaBuah[0]);
        System.out.println("Buah Kedua   : " + namaBuah[1]);
        System.out.println("Buah Ketiga  : " + namaBuah[2]);
        
        namaBuah[1] = "Nanas";
        System.out.println("Buah Kedua (Setelah diubah): " + namaBuah[1]);
        
        System.out.println("Jumlah Buah   : " + namaBuah.length);
    }   
}