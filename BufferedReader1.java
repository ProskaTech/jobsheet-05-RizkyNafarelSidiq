/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedreader1;

// Created Rizky Nafarel Sidiq 21343071
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BufferedReader1 {
    public static void main(String[] args) {
            BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
            
            String a, b;
            float angka1, angka2, jumlah;
            System.out.println("Program Penjumlahan Dua Buah Bilangan");
            
            try {
                System.out.println("Masukan angka pertama :");
                a = dataIn.readLine();
                /*Data yang akan diproses aritmatika harus di konversikan dulu
                dari tipe data string ke tipe data angka yang diperlukan.
                Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu String*/
                angka1 = Float.parseFloat(a); //konversi dari stringke float
                
                System.out.print("Masukan angka kedua:");
                b = dataIn.readLine();
                angka2 = Float.parseFloat(b); //konversi dari String ke float
                
                jumlah = angka1 + angka2;
                System.out.println("Jumlah : " + jumlah);
            }
            
            catch (IOException e) {
                System.out.println("gagal membaca keyboard");
            }
        
    }
    
}
