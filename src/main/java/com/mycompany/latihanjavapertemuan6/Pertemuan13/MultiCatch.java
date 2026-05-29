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
public class MultiCatch {
    public static void main(String[]args){
        int[] angka = {10, 20, 30, 40, 50};
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan index array (0-4): ");
            int idx = scan.nextInt();
            
            System.out.println("Isi array: " + angka[idx]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index yang Anda masukkan tida ada!");
        }catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        }catch (Exception e) {
            System.out.println("Terjadi error umum: " + e.getMessage());
        }
        scan.close();
    }
    
}
