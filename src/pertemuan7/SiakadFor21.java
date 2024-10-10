package pertemuan7;

/**
 * SiakadFor21
 */
import java.util.Scanner;

public class SiakadFor21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai < 60) {
                jumlahTidakLulus++;
            } else {
                jumlahLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Lulus: " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus: " + jumlahTidakLulus);
    }

}