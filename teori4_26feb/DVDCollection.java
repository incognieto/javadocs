import java.util.ArrayList;

public class DVDCollection {
    private ArrayList<dvd> dvdList;

    public DVDCollection() {
        this.dvdList = new ArrayList<>();
    }

    public void addDVDFilm(String title, String publisher, String category, int stock, String actor, String director) {
        dvdfilm dvdfilm = new dvdfilm(title, publisher, category, stock, actor, director);
        dvdList.add(dvdfilm);
    }

    public void addDVDMusic(String title, String publisher, String category, int stock, String singer, String producer, String[] topHits) {
        dvdmusic dvdmusic = new dvdmusic(title, publisher, category, stock, singer, producer, topHits);
        dvdList.add(dvdmusic);
    }

    public void viewData() {
        if (dvdList.isEmpty()) {
            System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|                                     (!) Koleksi DVD kosong. Segera Inputkan DVD                                      |");
            System.out.println("+----------------------------------------------------------------------------------------------------------------------+");
        } else {
            System.out.println("+-----------------------+------------+------------------+--------------------+-----------+----------+-------+----------+");
            System.out.println("|       Title DVD       | Film/Music | Pemeran/Penyanyi | Sutradara/Produser | Publisher | Kategori | Stock | Top Hits |");
            System.out.println("+-----------------------+------------+------------------+--------------------+-----------+----------+-------+----------+");
    
            for (dvd dvd : dvdList) {
                System.out.printf("| %-21s | %-10s | %-16s | %-18s | %-9s | %-8s | %-5d | %-8s |\n",
                        dvd.getTitle(), dvd instanceof dvdfilm ? "Film" : "Musik",
                        dvd instanceof dvdfilm ? ((dvdfilm) dvd).getActor() : ((dvdmusic) dvd).getSinger(),
                        dvd instanceof dvdfilm ? ((dvdfilm) dvd).getDirector() : ((dvdmusic) dvd).getProducer(),
                        dvd.getPublisher(), dvd.getCategory(), dvd.getStock(),
                        dvd instanceof dvdmusic ? String.join(", ", ((dvdmusic) dvd).getTopHits()) : "");
            }
            System.out.println("+-----------------------+------------+------------------+--------------------+-----------+----------+-------+----------+");
        }
    }    
}
