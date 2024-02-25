import java.util.Random;
import java.util.Scanner;

// Class untuk menjalankan program utama
public class RestaurantMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant menu = new Restaurant();  // Membuat objek Restaurant

        // Menambahkan beberapa menu makanan ke dalam restoran
        menu.tambahMenuMakanan("Ayam Goreng", 8_000, 20);
        menu.tambahMenuMakanan("Sayur Asem", 7_000, 5);
        menu.tambahMenuMakanan("Pepes Ikan", 8_000, 15);
        menu.tambahMenuMakanan("Gehu", 1_500, 30);
        menu.tambahMenuMakanan("Onde", 2_000, 40);
        menu.tambahMenuMakanan("Tahu", 1_500, 30);
        menu.tambahMenuMakanan("Tempe Orek", 1_500, 25);
        menu.tambahMenuMakanan("Nasi Padang", 10_000, 0);
        menu.tambahMenuMakanan("Es Teh", 8_000, 30);
        menu.tambahMenuMakanan("Es Jeruk", 8_000, 30);

        do {
            menu.tampilMenuMakanan();  // Menampilkan menu-menu yang tersedia
            System.out.print("(!) Mulai menambahkan pesanan? (y/n) : ");
            String tambahPesanan = scanner.next();

            if (tambahPesanan.equalsIgnoreCase("y")) {
                System.out.print("Masukan ID Item yang akan dipesan   : ");
                int itemId = scanner.nextInt();

                System.out.print("Masukan jumlah kuantitas pemesanan   : ");
                int quantity = scanner.nextInt();

                menu.pesanMenu(itemId, quantity);  // Memanggil metode pesanMenu pada objek Restaurant

                menu.tampilkanKeranjang(); // Menampilkan sementara keranjang setelah validasi
                
                System.out.print("(!) Ingin menambah pesanan? (y/n) : "); // Validasi apakah ingin menambah pesanan lagi
                String tambahLagi = scanner.next();

                if (!tambahLagi.equalsIgnoreCase("y")) {
                    break;  // Keluar dari loop jika tidak ingin menambah pesanan lagi
                }
            } else {
                break;  // Keluar dari loop jika tidak ingin menambah pesanan
            }

        } while (true);

        System.out.print("(!) Lakukan Pembayaran? (y/n) : ");
        String pembayaran = scanner.next();

        if (pembayaran.equalsIgnoreCase("y")) {
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("|			     Informasi Pembayaran			      |");
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("|             Virtual Account berlaku 1x24jam : " + generateVirtualAccount() + "             |");
            System.out.println("| 		Terima kasih, senang berbisnis dengan Anda!		      |");
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("|				cr : Nieto Salim Maula			      |");
            System.out.println("+-----------------------------------------------------------------------------+");
        } else {
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("|			     Informasi Pembayaran			      |");
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("| 				      					      |");
            System.out.println("| 	     Maaf, karena ada kendala, saat ini pembayaran dibatalkan.	      |");
            System.out.println("| 				      					      |");
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("|				cr : Nieto Salim Maula			      |");
            System.out.println("+-----------------------------------------------------------------------------+");
        }

        scanner.close();
    }

    // Metode untuk menghasilkan virtual account random 16 digit
    private static String generateVirtualAccount() {
        Random rand = new Random();
        StringBuilder virtualAccount = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            virtualAccount.append(rand.nextInt(10));
        }

        return virtualAccount.toString();
    }

}
