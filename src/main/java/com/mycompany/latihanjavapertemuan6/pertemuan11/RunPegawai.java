/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6.pertemuan11;

/**
 *
 * @author Lintang
 */
public class RunPegawai {
    public static void main(String[] args){
        Pegawai pgw = new Pegawai("Anton", 3000000);
        System.out.println("== Pegawai Biasa ==");
        pgw.tampilInfo();
        
        System.out.println("\n");
        
        Manajer mnr = new Manajer("Budi", 5000000, 2000000);
        System.out.println("== Pegawai Manajer ==");
        mnr.tampilInfo();
    }
    
}
