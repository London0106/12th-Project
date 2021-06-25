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

        String[] namaBarang ={""} ;
        int [] stockBarang = {0};
        int jumlahBarang = 0;
        int i = 0;
        String barangBeli;
        int jumlahBarangBeli;
        String cariBarang;
        
//        String namaBarang  [] = new String [jumlahBarang];
        //menu
        do {
            System.out.println("===Menu===");
            System.out.println("1.Nama Barang");
            System.out.println("2.Cari Barang");
            System.out.println("3.Menampil Barang & Stock");
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
                        stockBarang [j] = scan.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Cari Barang");
                    cariBarang = scan.next();
                    for (int k = 0; k <= jumlahBarang-1; k++) {
                        if (cariBarang.equalsIgnoreCase(namaBarang[k]) ) {


                            System.out.println("Barang is found");
                            System.out.println("Stock Barang = "+stockBarang[k]);
                        }
                    }

                    break;
                case 3 :
                    System.out.println("Barang yang dibeli");
                    System.out.println("=");
                    barangBeli = scan.next();
                    if (barangBeli !== cariBarang){
                        System.out.println("Barang does not exist.");
                     
                    }
                    else if (barangBeli == cariBarang){
                    System.out.println("Barang exist");
                    System.out.println("Barang = "+barangBeli);
                }
                    System.out.println("Jumlah barang yang ingin dibeli");
                    System.out.println("=");
                    jumlahBarangBeli = scan.nextInt();
                    if (barangBeli !== cariBarang){
                        System.out.println("Please try again...");
                    }
                    else if (barangBeli == cariBarang){
                            System.out.println("Jumlah barang = "+jumlahBarangBeli);
                            }
                    jumlahBarangBeli = jumlahBarangBeli - barangBeli;
                    System.out.println("Script Succesful . . .");
//                  stock barang akan dikurangi dengan jumlah barang yang ingin dibeli.Make stock.
                    break;
                default:
                    break;
            }

        } while (i != 0);

    }

        
    }
    

