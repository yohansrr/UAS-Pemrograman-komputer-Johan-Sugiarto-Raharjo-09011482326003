import java.util.Scanner;

public class Faktorisasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan bulat positif
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Menampilkan hasil faktorisasi
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        scanner.close();
    }

    // Metode untuk melakukan faktorisasi
    public static void faktorisasi(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
