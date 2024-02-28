public abstract class dvd {
    // Atribut
    protected String title;
    protected String publisher;
    protected String category;
    protected int stock;

    // Constructor
    public dvd(String title, String publisher, String category, int stock) {
        this.title = title;
        this.publisher = publisher;
        this.category = category;
        this.stock = stock;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    // Abstract method
    abstract void viewData();

    // Additional abstract method for getting summary
    abstract String getSummary();
}
