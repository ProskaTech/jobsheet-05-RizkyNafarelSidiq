/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbufferedreader;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class TugasBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String word1 = "", word2 = "", word3 = "";

        try{
            System.out.print("Enter word 1 : ");
            word1 = dataIn.readLine();
            System.out.print("Enter word 2 : ");
            word2 = dataIn.readLine();
            System.out.print("Enter word 3 : ");
            word3 = dataIn.readLine();
            
        }

        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }

        System.out.println(word1+" "+word2+" "+word3);    
    }
    
}
