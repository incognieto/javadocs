// Class untuk merepresentasikan pesanan dalam keranjang belanja
public class Pesanan {
    private MenuItem menuItem;
    private int quantity;

    public Pesanan(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public String getNamaItem() {
        return menuItem.getNama();
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return menuItem.getHarga() * quantity;
    }
}