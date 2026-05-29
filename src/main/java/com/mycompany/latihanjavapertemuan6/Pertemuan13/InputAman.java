/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapertemuan6.Pertemuan13;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Lintang
 */
public class InputAman {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.println("Masukan angka bulat: ");
            int angka = scan.nextInt();
            
            System.out.println("Angka yang Anda masukkan: " + angka );
        } catch (InputMismatchException e){
            System.out.println("Error: Input harus berupa angka, bukan huruf! ");
        } finally {
            System.out.println("Blok Finally: Selesai.");
            scan.close();
        }
    }
    
}
