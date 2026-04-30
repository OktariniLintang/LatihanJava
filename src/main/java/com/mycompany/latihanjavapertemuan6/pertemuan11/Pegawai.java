/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6.pertemuan11;

/**
 *
 * @author Lintang
 */
public class Pegawai {
    protected String nama;
    protected double gajipokok;
    
    public Pegawai(String nama, double gajipokok){
        this.nama = nama;
        this.gajipokok = gajipokok;
    }
    
    public void tampilInfo(){
        System.out.println("Nama      :" + nama);
        System.out.println("Gaji pokok:Rp" + gajipokok);
    }
}
