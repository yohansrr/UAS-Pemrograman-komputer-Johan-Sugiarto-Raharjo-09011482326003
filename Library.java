public class Library {
    public static void main(String[] args) {
        //Membuat informasi buku dengan array 2D
        String[][] books = {
                {"Java Programming              ","John Smith", "2020", "Tersedia"},
                {"Data Structures and Algorithms", "Alice Johnson","2019", "Tidak Tersedia"},
                {"Introduction to AI            ","Robert Williams", "2022", "Tersedia"},
                {"Database Management           ","Emily Davis", "2018", "Tersedia"},
                {"Web Development               ","Michael Brown", "2021", "Tersedia"}
        };

        // Melakukan sorting bubble pada kolom judul
        bubbleSort(books, 0);

        // Menampilkan informasi buku di perpustakaan
        System.out.println("Judul\t\t\t\t\t\tAuthor\t\t\tTahun\tStatus");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (String[] book : books) {
            System.out.println(
                    book[0] + "\t\t\t" +
                            book[1] + "\t\t" +
                            book[2] + "\t" +
                            book[3]
            );
        }

        // Melakukan linear search berdasarkan judul buku
        String searchTitle = "Database Management";
        int index = linearSearch(books, searchTitle);

        // Menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("\nBuku dengan judul '" + searchTitle + "' ditemukan di indeks " + index);
        } else {
            System.out.println("\nBuku dengan judul '" + searchTitle + "' tidak ditemukan.");
        }
    }
    public static void bubbleSort(String[][] array, int column) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j][column].compareTo(array[j + 1][column]) > 0) {
                    // Swap elements
                    String[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }



    // Method untuk melakukan pencarian linear berdasarkan judul buku
    static int linearSearch(String[][] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i][0].contains(title)) {
                return i; // Mengembalikan indeks jika judul buku ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika judul buku tidak ditemukan


    }
}