import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DVDCollection dvdCollection = new DVDCollection();

        int choice;
        do {
            dvdCollection.viewData();
            System.out.println("(1) Add DVD");
            System.out.println("(2) Exit");
            System.out.print("Input (1/2) : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addDVDMenu(scanner, dvdCollection);
                    break;
                case 2:
                    System.out.println("Program berakhir.");
                    break;
                default:
                    System.out.println("Input tidak valid. Silakan coba lagi.");
            }
        } while (choice != 2);

        scanner.close();
    }

    private static void addDVDMenu(Scanner scanner, DVDCollection dvdCollection) {
        int dvdType;
        do {
            System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|                                                      (!) Add DVD                                                     |");                                        
            System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
            System.out.println("(1) DVD Film");
            System.out.println("(2) DVD Music");
            System.out.println("(3) Exit");
            System.out.print("Input (1/2/3) : ");
            dvdType = scanner.nextInt();

            switch (dvdType) {
                case 1:
                    addDVDFilm(scanner, dvdCollection);
                    break;
                case 2:
                    addDVDMusic(scanner, dvdCollection);
                    break;
                case 3:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Input tidak valid. Silakan coba lagi.");
            }
        } while (dvdType != 3);
    }

    private static void addDVDFilm(Scanner scanner, DVDCollection dvdCollection) {
        System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                 (!) Add DVD Film                                                     |");                                        
        System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
        scanner.nextLine(); // Menambahkan ini untuk menangani newline dari input sebelumnya
        System.out.print("Input Judul: ");
        String title = scanner.nextLine(); // Menggunakan nextLine() untuk mendapatkan seluruh baris input
        System.out.print("Input Pemeran: ");
        String actor = scanner.nextLine();
        System.out.print("Input Sutradara: ");
        String director = scanner.nextLine();
        System.out.print("Input Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Input Kategori (SU | D | R | A): ");
        String category = scanner.next();
        System.out.print("Input Stok: ");
        int stock = scanner.nextInt();
    
        dvdCollection.addDVDFilm(title, publisher, category, stock, actor, director);
        System.out.println("(!) Data berhasil terupdate");
    }    

    private static void addDVDMusic(Scanner scanner, DVDCollection dvdCollection) {
        System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                 (!) Add DVD Music                                                    |");                                        
        System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
        
        scanner.nextLine(); // Membersihkan newline character di buffer
    
        System.out.print("Input Judul: ");
        String title = scanner.nextLine();
        System.out.print("Input Penyanyi: ");
        String singer = scanner.nextLine();
        System.out.print("Input Produser: ");
        String producer = scanner.nextLine();
        System.out.print("Input Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Input Top Hits: ");
        String[] topHits = scanner.nextLine().split(",");
        System.out.print("Input Kategori (C | J | P | R | O): ");
        String category = scanner.next();
        System.out.print("Input Stok: ");
        int stock = scanner.nextInt();
    
        dvdCollection.addDVDMusic(title, publisher, category, stock, singer, producer, topHits);
        System.out.println("(!) Data berhasil terupdate");
    }    
}
