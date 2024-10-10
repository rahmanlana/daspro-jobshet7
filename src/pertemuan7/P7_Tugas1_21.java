package pertemuan7;

import java.util.Scanner;

public class P7_Tugas1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiketTerjual = 0,
                hargaTiket = 50000,
                jumlahPelanggan, jumlahTiket;
        double totalPenjualan = 0,
                totalHarga;

        System.out.print("Mmasukkan Jumlah Pelanggan: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.println("Masukkan jumlah tiket yang ingin di blei oleh pelanggan 1:");
            jumlahTiket = sc.nextInt();
            totalTiketTerjual += jumlahTiket;

            totalHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket < 0) {
                System.out.println("Total Tiket tidak valid masukkan total tiket yang valid");
                continue;
            }

            if (jumlahTiket > 4 && jumlahTiket <= 10) {
                totalHarga -= totalHarga * 0.10;
            } else if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15;
            }
        }
        System.out.println("Total tiket terjual:" + totalTiketTerjual);
        System.out.println("Total penjualan tiket : Rp." + totalPenjualan);
    }
}
