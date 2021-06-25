/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project32;

import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] namaBarang = {""};
        int[] stockBarang = {0};
        int jumlahBarang = 0;
        int i = 0;
        String barangBeli;
        int jumlahBarangBeli;
        String cariBarang;

//        String namaBarang  [] = new String [jumlahBarang];
        //menu
        do {
//          
            System.out.println("cls");
            System.out.println("===Menu===");
            System.out.println("1.Insert Barang");
            System.out.println("2.Cari Barang dan Stok");
            System.out.println("3.Membeli Barang");
            
            System.out.println("=");
            
            i = scan.nextInt();
            switch (i) {
                case 1:
         
                    System.out.println("Insert Jumlah Barang");
                    jumlahBarang = scan.nextInt();
                    namaBarang = new String[jumlahBarang];
                    stockBarang = new int[jumlahBarang];
                    for (int j = 0; j <= jumlahBarang - 1; j++) {
                        System.out.println("Input Nama Barang = ");
                        namaBarang[j] = scan.next();
                        System.out.println("Input Stock Barang = ");
                        stockBarang[j] = scan.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Cari Barang");
                    cariBarang = scan.next();
                    for (int k = 0; k <= jumlahBarang - 1; k++) {
                        if (cariBarang.equalsIgnoreCase(namaBarang[k])) {

                            System.out.println("Barang is found");
                            System.out.println("Stock Barang = " + stockBarang[k]);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Barang yang dibeli");
                    System.out.println("=");
                    barangBeli = scan.next();
                    for (int z = 0; z <= jumlahBarang - 1; z++) {
                        if (barangBeli.equalsIgnoreCase(namaBarang[z])) {
                            System.out.println("Barang is Found ");
                            System.out.println("Berapa Barang Yang Ingin Dibeli ?");
                            int jumlahBeli = scan.nextInt();
                            stockBarang[z] = stockBarang[z] - jumlahBeli;
                        }
                    }
                    //                  stock barang akan dikurangi dengan jumlah barang yang ingin dibeli.Make stock.
                    break;
                default:
                    break;
            }

        } while (i != 0);

    }

}
