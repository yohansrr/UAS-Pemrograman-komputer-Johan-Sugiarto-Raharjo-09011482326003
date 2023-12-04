package uas;

import java.util.Scanner;

public class TokoOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        // Input jumlah pembelian
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlahPembelian = scanner.nextInt();

        // Menghitung diskon berdasarkan jumlah pembelian
        double diskon = 0.0;
        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = 0.05;
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = 0.1;
        } else if (jumlahPembelian > 20) {
            diskon = 0.2;
        }

        // Menghitung total harga setelah diskon
        double totalHarga = hargaBarang * jumlahPembelian;
        double totalSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Menampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: " + totalSetelahDiskon);

        scanner.close();
    }
}