import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Pilihan operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan nomor operasi (1-4): ");
        int pilihan = scanner.nextInt();

        // Memanggil metode sesuai operasi yang dipilih
        switch (pilihan) {
            case 1:
                penjumlahan(angka1, angka2);
                break;
            case 2:
                pengurangan(angka1, angka2);
                break;
            case 3:
                perkalian(angka1, angka2);
                break;
            case 4:
                pembagian(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
        }

        scanner.close();
    }

    // Metode untuk penjumlahan
    public static void penjumlahan(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    // Metode untuk pengurangan
    public static void pengurangan(double a, double b) {
        double hasil = a - b;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    // Metode untuk perkalian
    public static void perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil perkalian: " + hasil);
    }

    // Metode untuk pembagian
    public static void pembagian(double a, double b) {
        if (b != 0) {
            double hasil = a / b;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
        }
    }
}
