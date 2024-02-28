public class dvdmusic extends dvd {
    // Atribut
    private String singer;
    private String producer;
    private String[] topHits;

    // Constructor
    public dvdmusic(String title, String publisher, String category, int stock, String singer, String producer, String[] topHits) {
        super(title, publisher, category, stock);
        this.singer = singer;
        this.producer = producer;
        this.topHits = topHits;
    }

    // Getter
    public String getSinger() {
        return singer;
    }

    public String getProducer() {
        return producer;
    }

    public String[] getTopHits() {
        return topHits;
    }

    // Method
    @Override
    void viewData() {
        System.out.println("\nJudul Album\t: " + super.getTitle());
        System.out.println("Penyanyi\t: " + this.getSinger());
        System.out.println("Produser\t: " + this.getProducer());
        System.out.println("Publisher\t: " + super.getPublisher());
        System.out.println("Kategori\t: " + super.getCategory());
        System.out.println("Stok\t\t: " + super.getStock());
    }

    // Additional method for getting summary
    @Override
    String getSummary() {
        return "Judul: " + super.getTitle() + ", Penyanyi: " + this.getSinger() + ", Produser: " + this.getProducer();
    }
}
