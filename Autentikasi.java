import java.util.Scanner;

public class Autentikasi {

    public static void main(String[] args) {
        // Deklarasi variabel
        String username;
        String password;
        String usernameBenar = "Johan Sugiarto Raharjo";
        String passwordBenar = "123456";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();

        // Melakukan autentikasi
        if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}