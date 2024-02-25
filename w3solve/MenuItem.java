// Class untuk merepresentasikan satu item menu makanan
public class MenuItem {
    private String nama;    // Nama menu
    private double harga;   // Harga menu
    private int stok;       // Jumlah stok menu

    // Constructor untuk membuat objek MenuItem dengan informasi awal
    public MenuItem(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Metode untuk mendapatkan nama menu (getter!)
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan harga menu (getter!)
    public double getHarga() {
        return harga;
    }

    // Metode untuk mendapatkan jumlah stok menu (getter!)
    public int getStok() {
        return stok;
    }

    // Metode untuk mengecek apakah menu habis stok atau tidak (getter!)
    public boolean isOutOfStock() {
        return stok == 0;
    }

    // Metode untuk mengurangi stok menu berdasarkan jumlah pesanan
    public void kurangiStok(int quantity) {
        stok -= quantity;
    }
}
