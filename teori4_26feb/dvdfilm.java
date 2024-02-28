public class dvdfilm extends dvd {
    // Atribut
    private String actor;
    private String director;

    // Constructor
    public dvdfilm(String title, String publisher, String category, int stock, String actor, String director) {
        super(title, publisher, category, stock);
        this.actor = actor;
        this.director = director;
    }

    // Getter
    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }

    // Method
    @Override
    void viewData() {
        System.out.println("\nJudul Film\t: " + super.getTitle());
        System.out.println("Pemeran\t\t: " + this.getActor());
        System.out.println("Sutradara\t: " + this.getDirector());
        System.out.println("Produser\t: " + super.getPublisher());
        System.out.println("Kategori\t: " + super.getCategory());
        System.out.println("Stok\t\t: " + super.getStock());
    }

    // Additional method for getting summary
    @Override
    String getSummary() {
        return "Judul: " + super.getTitle() + ", Pemeran: " + this.getActor() + ", Sutradara: " + this.getDirector();
    }
}
