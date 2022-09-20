/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner1;

// Created Rizky Nafarel Sidiq 21343071
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.print("Masukan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama : " + nama +
                           "\nNIM : " + NIM +
                           "\nNilai : " +nilai);
    }
    
}
