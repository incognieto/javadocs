import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class untuk merepresentasikan restoran
public class Restaurant {
    private MenuItem[] menuItems;  // Array untuk menyimpan menu-menu restoran
    private static byte id = 0;    // ID untuk menunjukkan indeks terakhir menu yang ditambahkan
    private List<Pesanan> keranjang;  // List untuk menyimpan pesanan-pesanan dalam keranjang
    private Scanner scanner;

    // Constructor untuk membuat objek Restaurant
    public Restaurant() {
        menuItems = new MenuItem[20];  // Inisialisasi array menuItems dengan kapasitas 10
        scanner = new Scanner(System.in); // Inisialisasi objek Scanner
        keranjang = new ArrayList<>();  // Inisialisasi list keranjang
    }

    // Metode untuk menambahkan menu makanan ke dalam restoran
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        MenuItem menuItem = new MenuItem(nama, harga, stok);  // Membuat objek MenuItem baru
        menuItems[id] = menuItem;  // Menambahkan objek MenuItem ke dalam array menuItems
        nextId();  // Panggil metode nextId untuk mengubah nilai id
    }

    // Metode untuk menampilkan menu-menu makanan yang tersedia dalam format tabel
    public void tampilMenuMakanan() {
        System.out.println("+----+-----------+----------------+-------+");
        System.out.println("|           Daftar Menu Makanan           |");
        System.out.println("+----+-----------+----------------+-------+");
        System.out.println("| NO | Nama Item | Harga (satuan) | Stock |");
        System.out.println("+----+-----------+----------------+-------+");

        int menuCount = 0;  // Menyimpan jumlah menu yang ditampilkan

        for (int i = 0; i <= id; i++) {
            MenuItem menuItem = menuItems[i];
            if (menuItem != null) {
                // Menampilkan informasi menu dalam format tabel, termasuk yang stoknya 0
                System.out.printf("| %-2d | %-9s | Rp. %-10.1f | %-5d |\n", i + 1, menuItem.getNama(), menuItem.getHarga(), menuItem.getStok());
                menuCount++;
            }
        }

        if (menuCount == 0) {
            // Menampilkan pesan khusus jika tidak ada menu yang tersedia
            System.out.println("|       Tidak ada menu yang tersedia      |");
        }

        System.out.println("+-----------------------------------------+");
    }

    // Metode untuk memproses pesanan
    public void pesanMenu(int itemId, int quantity) {
        if (itemId > 0 && itemId <= id) {
            MenuItem menuItem = menuItems[itemId - 1];
            if (menuItem != null && menuItem.getStok() >= quantity) {
                System.out.printf("(!) Anda akan membeli %s %d pcs, tambahkan pada keranjang? (y/n) : ", menuItem.getNama(), quantity);
                String tambahKeranjang = scanner.next();

                if (tambahKeranjang.equalsIgnoreCase("y")) {
                    menuItem.kurangiStok(quantity);  // Kurangi stok menu
                    tambahKeranjang(menuItem, quantity);  // Tambahkan pesanan ke dalam keranjang
                    System.out.println("(!) Pesanan berhasil ditambahkan ke dalam keranjang.");
                } else {
                    System.out.println("(!) Pesanan dibatalkan.");
                }
            } else {
                System.out.println("(!) Stok tidak mencukupi untuk pesanan ini.");
            }
        } else {
            System.out.println("(!) ID Item tidak valid.");
        }
    }

    // Jangan lupa untuk menutup Scanner setelah tidak digunakan
    public void closeScanner() {
        scanner.close();
    }

    // Metode untuk menambahkan pesanan ke dalam keranjang
    private void tambahKeranjang(MenuItem menuItem, int quantity) {
        Pesanan pesanan = new Pesanan(menuItem, quantity);  // Membuat objek Pesanan baru
        keranjang.add(pesanan);  // Menambahkan objek Pesanan ke dalam list keranjang
    }

    // Metode untuk menampilkan keranjang belanja
    public void tampilkanKeranjang() {
        if (keranjang.isEmpty()) {
            System.out.println("(!) Keranjang belanja masih kosong.");
        } else {
            System.out.println("+-----------------------------------------+");
            System.out.println("|             Keranjangmu                 |");
            System.out.println("+----+---------------+-----+--------------+");
            System.out.println("| ID | Nama Item     | Qty | Total (Item) |");
            System.out.println("+----+---------------+-----+--------------+");

            int totalPembayaran = 0;
            for (int i = 0; i < keranjang.size(); i++) {
                Pesanan pesanan = keranjang.get(i);
                System.out.printf("| %-2d | %-13s | %-3d | Rp. %-8.1f |\n",
                        i + 1, pesanan.getNamaItem(), pesanan.getQuantity(), pesanan.getTotal());
                totalPembayaran += pesanan.getTotal(); // Menghitung total pembayaran
            }

            System.out.println("+-----------------------------------------+");
            System.out.printf("| Total Pembayaran   | %-3d | Rp. %-8.1f |\n", keranjang.stream().mapToInt(Pesanan::getQuantity).sum(), (double) totalPembayaran);
            System.out.println("+-----------------------------------------+");
        }
    }


    private static void nextId() {  // Metode untuk mengubah nilai id
        id++;
    }
}