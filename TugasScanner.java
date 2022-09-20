/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasscanner;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */

import java.util.Scanner;

public class TugasScanner {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.print("Enter Word 1 : ");
        String word1 = in.nextLine();

        System.out.print("Enter Word 2 : ");
        String word2 = in.nextLine();

        System.out.print("Enter Word 3 : ");
        String word3 = in.nextLine();

        System.out.println(word1+" " + word2+" " +word3);
    }
    
}
