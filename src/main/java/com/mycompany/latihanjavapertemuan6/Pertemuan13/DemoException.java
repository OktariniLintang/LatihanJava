/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6.Pertemuan13;

/**
 *
 * @author Lintang
 */
public class DemoException {
    public static void main(String[]args){
        int angka1 = 10;
        int angka2 = 0;
        
        System.out.println("Program dimulai...");
        
        try {
            int hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e){
            System.out.println("Error: Tidak bisa dibagi dengan angka nol!");
        }
        System.out.println("Program selesai.");
    }
}
