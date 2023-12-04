import java.util.Scanner;

public class AkunPengguna {
    // Atribut akun
    private String username;
    private String password;
    private boolean aktif; // Menandakan apakah akun aktif atau tidak

    // Konstruktor
    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true; // Saat akun dibuat, dianggap aktif
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInfo() {
        System.out.println("Informasi Akun:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        if (!aktif) {
            aktif = true;
            System.out.println("Akun berhasil diaktifkan.");
        } else {
            System.out.println("Akun sudah aktif.");
        }
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        if (aktif) {
            aktif = false;
            System.out.println("Akun berhasil dinonaktifkan.");
        } else {
            System.out.println("Akun sudah nonaktif.");
        }
    }

    // Metode main untuk menguji kelas AkunPengguna
    public static void main(String[] args) {
        // Membuat objek akun
        AkunPengguna akun1 = new AkunPengguna("user123", "password123");

        // Menampilkan informasi akun
        akun1.tampilkanInfo();

        // Menonaktifkan akun
        akun1.nonaktifkanAkun();

        // Menampilkan informasi setelah dinonaktifkan
        akun1.tampilkanInfo();

        // Mengaktifkan akun
        akun1.aktifkanAkun();

        // Menampilkan informasi setelah diaktifkan
        akun1.tampilkanInfo();
    }
}
