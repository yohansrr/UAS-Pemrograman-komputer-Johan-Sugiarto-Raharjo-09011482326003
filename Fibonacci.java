import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah suku Fibonacci yang ingin ditampilkan
        System.out.print("Masukkan jumlah suku Fibonacci yang ingin ditampilkan: ");
        int n = scanner.nextInt();

        // Menampilkan deret Fibonacci hingga suku ke-n
        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    // Metode untuk menghitung nilai suku ke-n dalam deret Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
