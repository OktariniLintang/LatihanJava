/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6;

/**
 *
 * @author Lintang
 */
public class TugasManProduct {
    // Atribut dibuat Private
    private String namaProduk;
    private double harga;
    private int stok;
    
    // Construktor
    public TugasManProduct(String namaProduk,double harga,int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;         
    }
    
    // Getter
    public String getNamaProduk() {
        return namaProduk;
    }
    public double getharga() {
        return harga;
    }
    public int stok() {
        return stok;
    }
    
}
