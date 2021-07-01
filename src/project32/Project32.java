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
    public int diskon(int hargaTotal){
//        Jumlah barang yang dibeli lebih besar 5 dia dapat diskon 5  % ; 
        return hargaTotal ; 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] namaBarang = {""};
        String[] namaBarang1 = {""};
        int[] stockBarang = {0};
        int[] newHargaBarang={0};
        int jumlahBarang = 0;
        int i = 0;
        String barangBeli;
        int jumlahBarangBeli;
        int continues;
        String addNamaBarang;
        int tampilHargaBarang;
        int addBarang;
        String cariBarang;
        int temp = 0;
        int harga;
        int[] hargaPerBarang = {0};
        int hargaTotal;
        int editHargaBarang;
        String newNamaBarang;
        do {

            System.out.println("===Menu===");
            System.out.println("|| 1.Insert Barang");
            System.out.println("|| 2.Cari Barang dan Stok");
            System.out.println("|| 3.Membeli Barang");
            System.out.println("|| 4.Adding Stock");
            System.out.println("|| 5.Edit Nama Barang");
            System.out.println("|| 6.Edit Harga Barang");
 
            System.out.println("==================");

            i = scan.nextInt();
            switch (i) {
                case 1:

                    System.out.println("Insert Jumlah Barang");
                    jumlahBarang = scan.nextInt();
                    hargaPerBarang = new int[jumlahBarang];
                    namaBarang = new String[jumlahBarang];
                    stockBarang = new int[jumlahBarang];
                    for (int j = 0; j <= jumlahBarang - 1; j++) {
                        System.out.println("Input Nama Barang = ");
                        namaBarang[j] = scan.next();
                        System.out.println("Input Stock Barang = ");
                        stockBarang[j] = scan.nextInt();
                        System.out.println("Input Harga per Barang = ");
                        hargaPerBarang[j] = scan.nextInt();
                        temp = 1;
                      
                   
                    }
                    break;

                case 2:
                    if (temp == 0) {
                        System.out.println("Barang Belum Inputkan");
                    } else if (temp == 1) {

                        System.out.println("========= Cari Barang ==========");
                        cariBarang = scan.next();
                        for (int k = 0; k <= jumlahBarang - 1; k++) {
                            if (cariBarang.equalsIgnoreCase(namaBarang[k])) {

                                System.out.println("Barang is found");
                                System.out.println("Stock Barang = " + stockBarang[k]);
                                System.out.println("Harga Per Barang = " + hargaPerBarang[k]);
                                System.out.println("=======");
                            }
                        }

                    }

                    break;
                case 3:
                    if (temp == 0) {
                        System.out.println("Barang Belum Inputkan ");
                    } else if (temp == 1) {
                        System.out.println("Barang yang dibeli");
                        System.out.println("=");
                        barangBeli = scan.next();

                        for (int z = 0; z <= jumlahBarang - 1; z++) {
                            if (barangBeli.equalsIgnoreCase(namaBarang[z])) {
                                System.out.println("Barang is Found ");
                                System.out.println("Jumlah Barang Yang Ingin Dibeli ?");
                                System.out.println("===========================");
                                int jumlahBeli = scan.nextInt();
                                if (stockBarang[z] < jumlahBeli) {
                                    System.out.println("Out Of Stock  !!!! ");
                                } else {
                                    hargaTotal = hargaPerBarang[z] * jumlahBeli;
                                System.out.println("Harga Total = "+hargaTotal);
                                    stockBarang[z] = stockBarang[z] - jumlahBeli;
                                    hargaTotal = hargaPerBarang[z] * jumlahBeli;
                                    System.out.println("Harga Total = " + hargaTotal);

                                }

                            }
                        }
                    }

                    //                  stock barang akan dikurangi dengan jumlah barang yang ingin dibeli.Make stock.
                    break;

                case 4:
                    if (temp == 0) {
                        System.out.println("Barang Belum Inputkan");
                    } else if (temp == 1) {
                        System.out.println("Welcome to Adding Stock Menu.");
                        System.out.println("===========  ADDING STOCK MENU ==========");
                        System.out.println("1.Nama Barang Yang Ingin Ditambahkan ");
                        System.out.println("=");
                        addNamaBarang = scan.next();
                        for (int o = 0; o <= jumlahBarang - 1; o++) {
                            if (addNamaBarang.equalsIgnoreCase(namaBarang[o])) {
                                System.out.println("---- Barang Ditemukan -----");
                                System.out.println("2. Jumlah stok barang yang Ingin DitambahKan  ");
                                System.out.println("=");
                                int addStockBarang = scan.nextInt();
                                stockBarang[o] = addStockBarang + stockBarang[o];
                                System.out.println("Success Adding Stock !!!");

                            } else {
                                System.out.println("Barang is Not FOUND ");

                            }

                        }

                    }
                case 5:
                    System.out.println("=======Edit Nama Barang ==========");
                    System.out.println("Cari Nama Barang ");
                    cariBarang = scan.next();
                    for(int v = 0; v <= jumlahBarang - 1; v++){
                        if(cariBarang.equalsIgnoreCase(namaBarang[v])){
                            System.out.println("nama barang yang baru = ");
                            newNamaBarang = scan.next();
                            System.out.println("Index ke "+newNamaBarang);
                            namaBarang[v]= newNamaBarang ;
                            
                        }
                    }
                  
                    System.out.println("=");
                    break;
                case 6 : 
                       
                       System.out.println("========== Edit Harga Barang =======");
                       System.out.println("Masukan Nama Barang = ");
                       newNamaBarang = scan.next();
                       for(int b = 0; b <= jumlahBarang - 1; b++){
                           if(newNamaBarang.equalsIgnoreCase(namaBarang[b])){
                               System.out.println("hargaBarang yang baru = ");
                               newHargaBarang[b] = scan.nextInt();
                               System.out.println("Index ke"+newNamaBarang);
                               hargaPerBarang[b]=newNamaBarang[b];
                           }
                       }
                       System.out.println("Tampilan Harga Barang = ");
                       tampilHargaBarang = scan.nextInt();
                       System.out.println("Masukan Harga Barang Baru = ");
                       editHargaBarang = scan.nextInt();
                       
                    break; 
                default:
                    break;
            }

        } while (i != 0);

    }

}
