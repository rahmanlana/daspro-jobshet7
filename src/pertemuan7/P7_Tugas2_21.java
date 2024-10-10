package pertemuan7;

import java.util.Scanner;

public class P7_Tugas2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        while (true) {
            System.out.println("Masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 = keluar)");
            jenis = sc.nextInt();
            if (jenis == 0) {
                System.out.println("Berhasil Keluar");
                break;
            }
            System.out.println("Masukkan durasi prakir anda");
            durasi = sc.nextInt();

            if (jenis == 1) {
                total = durasi * 3000;
            } else if (jenis == 2) {
                total = durasi * 2000;
            } else {
                System.out.println("Tipe kendaraan tidak valid");
                continue;
            }

            if (durasi < 5) {
                total = 12500;
            }
            System.out.println("Total Biaya parkir: Rp." + total);
        }

    }
}
