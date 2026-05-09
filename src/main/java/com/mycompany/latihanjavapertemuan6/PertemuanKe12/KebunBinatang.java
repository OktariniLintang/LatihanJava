/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6.PertemuanKe12;

/**
 *
 * @author Lintang
 */
public class KebunBinatang {
    public static void main(String[]args){
        Hewan[] KumpulanHewan = new Hewan[3];
        
        KumpulanHewan[0] = new Hewan();
        KumpulanHewan[1] = new Kucing();
        KumpulanHewan[2] = new Anjing();
        
        System.out.println("=== Sinfoni Kebun Binatang ===");
        for (Hewan h : KumpulanHewan){
            h.bersuara();
        }
    }
    
}
