import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kata atau frase
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Memanggil metode untuk mengecek apakah palindrom atau tidak
        if (isPalindrom(input)) {
            System.out.println("Palindrom!");
        } else {
            System.out.println("Bukan palindrom.");
        }

        scanner.close();
    }

    // Metode untuk mengecek apakah suatu kata atau frase adalah palindrom
    public static boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah menjadi huruf kecil
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        // Membandingkan karakter dari depan dan belakang
        int i = 0;
        int j = cleanedStr.length() - 1;

        while (i < j) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
