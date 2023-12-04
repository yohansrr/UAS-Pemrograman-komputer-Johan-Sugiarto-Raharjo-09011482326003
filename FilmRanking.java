public class FilmRanking {
    public static void main(String[] args) {
        // Mendefinisikan film dan peringkat film dalam array 2D
        String[][] filmData = {
                {"The Shawshank Redemption", "Drama", "4.8"},
                {"The Godfather", "Crime", "4.9"},
                {"Pulp Fiction", "Crime", "4.7"},
                {"The Dark Knight", "Action", "4.5"},
                {"Forest Gump", "Action", "4.6"}
        };

// Melakukan sorting bubble pada kolom peringkat
        bubbleSort(filmData, 2);

// Menampilkan peringkat setiap film
        for (String[] film : filmData) {
            String filmTitle = film[0];
            String genre = film[1];
            String rating = film[2];
            System.out.println(filmTitle + " (" + genre + ") memiliki peringkat " + rating);
        }



        // Melakukan linear search berdasarkan judul film
        String searchFilmTitle = "Pulp Fiction";
        int index = linearSearch(filmData, searchFilmTitle);

        // Menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("\nFilm dengan judul '" + searchFilmTitle + "' ditemukan di indeks " + index);
        } else {
            System.out.println("\nFilm dengan judul '" + searchFilmTitle + "' tidak ditemukan.");
        }

        // Menentukan peringkat tertinggi film
        String filmTerbaik = getFilmTerbaik(filmData);
        System.out.println("Film terbaik yaitu: " + filmTerbaik);
    }

    // Method untuk melakukan linear search berdasarkan judul film
    private static int linearSearch(String[][] filmData, String title) {
        for (int i = 0; i < filmData.length; i++) {
            if (filmData[i][0].equalsIgnoreCase(title)) {
                return i; // Mengembalikan indeks jika judul film ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika judul film tidak ditemukan
    }

    // Metode untuk mendapatkan film dengan peringkat tertinggi dari array 2D
    private static String getFilmTerbaik(String[][] filmData) {
        String filmTerbaik = null;
        double peringkatTertinggi = Double.MIN_VALUE;

        for (String[] film : filmData) {
            double rating = Double.parseDouble(film[2]);
            if (rating > peringkatTertinggi) {
                peringkatTertinggi = rating;
                filmTerbaik = film[0];
            }
        }
        return filmTerbaik;
    }

    public static void bubbleSort(String[][] array, int column) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Double.parseDouble(array[j][column]) > Double.parseDouble(array[j + 1][column])) {
                    // Swap elements
                    String[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}