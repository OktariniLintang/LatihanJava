/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6.pertemuan11;

/**
 *
 * @author Lintang
 */
public class Manajer extends Pegawai { 
private double tunjangan;
  
public Manajer(String nama, double gajiPokok, double tunjangan) {  
    super(nama, gajiPokok);  
    this.tunjangan = tunjangan;  
}  


@Override   
public void tampilInfo() {  
    System.out.println("--- Data Manajer ---");  
    System.out.println("Nama         : " + nama);  
    System.out.println("Gaji Pokok   : Rp " + gajipokok);  
    System.out.println("Tunjangan    : Rp " + tunjangan);  
    System.out.println("Total        : Rp " + (gajipokok + tunjangan));  
}

}