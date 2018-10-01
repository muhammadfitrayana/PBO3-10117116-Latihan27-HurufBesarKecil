/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Menampilkan Huruf Kapital atau Kecil
 *  
 */
public class PBO310117116Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat;
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukan Kalimat : ");
        Kalimat = input.nextLine();
        
        System.out.print("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + Kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + Kalimat.toLowerCase());
    }
    
}
