/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan49_biayaemaskawin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Program Biaya Emas Kawin
 */
public class PBOUlang_10116138_Latihan49_BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emas = new Emas();
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        
        System.out.println("===Program Emas===");
        System.out.print("Berat emas = ");
        emas.setBeratEmas(scn1.nextFloat());
        System.out.print("Harga emas per-gram : ");
        emas.setHargaEmas(scn2.nextFloat());
        System.out.println("");
        System.out.println("Harga emas adalah = " + emas.totalBayar(15.7, 570000));

    }
    
}
