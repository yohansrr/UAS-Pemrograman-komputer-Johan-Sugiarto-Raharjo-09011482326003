import java.util.Scanner;

public class Buku {
    // Atribut buku
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia; // Menandakan apakah buku tersedia untuk dipinjam

    // Konstruktor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true; // Saat buku dibuat, dianggap tersedia
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku sedang tidak tersedia.");
        }
    }

    // Metode main untuk menguji kelas Buku
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Java Programming", "John Doe", 2020);
        Buku buku2 = new Buku("Python Programming", "Johan S", 2023);

        // Menampilkan informasi buku
        buku1.tampilkanInfo();

        // Meminjam buku
        buku1.pinjamBuku();

        // Menampilkan informasi setelah dipinjam
        buku1.tampilkanInfo();

         // Menampilkan informasi buku
        buku2.tampilkanInfo();

        // Meminjam buku
        buku2.pinjamBuku();

        // Menampilkan informasi setelah dipinjam
        buku2.tampilkanInfo();
    }
}
