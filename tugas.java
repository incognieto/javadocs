/*
    Author      : Nieto Salim Maula - 231524019
    Accessed    : Monday, 19 February 2024
*/

// Superclass / Abstract Class
abstract class Tumbuhan {
    public String nama;

    public Tumbuhan(String nama) {
        this.nama = nama;
    }

    public abstract void pertumbuhan();

    public String getNama() {
        return nama;
    }
}

// Subclass dari Tumbuhan
class TumbuhanBerkeping extends Tumbuhan {
    public TumbuhanBerkeping(String nama) {
        super(nama);
    }

    public void pertumbuhan() {
        System.out.println("Pertumbuhan tumbuhan berkeping.");
    }
}

// Subclass dari TumbuhanBerkeping
class Monokotil extends TumbuhanBerkeping {
    public Monokotil(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    public void pertumbuhan() {
        System.out.println(getNama() + " : tumbuhan Monokotil.");
    }
}

// Subclass dari TumbuhanBerkeping
class Dikotil extends TumbuhanBerkeping {
    public Dikotil(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan

    public void pertumbuhan() {
        System.out.println(getNama() + " : tumbuhan Dikotil.");
    }
}

// Subclass dari Tumbuhan
class MetodePertumbuhan extends Tumbuhan {
    public MetodePertumbuhan(String nama) {
        super(nama);
    }

    
    public void pertumbuhan() {
        System.out.println("Pertumbuhan menggunakan metode tertentu.");
    }
}

// Subclass dari MetodePertumbuhan
class Berkeping extends MetodePertumbuhan {
    public Berkeping(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    public void pertumbuhan() {
        System.out.println(getNama() + " : Pertumbuhan menggunakan metode berkeping.");
    }
}

// Subclass dari MetodePertumbuhan
class Bersel extends MetodePertumbuhan {
    public Bersel(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhanss
    public void pertumbuhan() {
        System.out.println(getNama() + " : Pertumbuhan menggunakan metode bersel.");
    }
}

// Subclass dari Tumbuhan
class JenisDaun extends Tumbuhan {
    public JenisDaun(String nama) {
        super(nama);
    }
    
    public void pertumbuhan() {
        System.out.println(getNama() + " : Pertumbuhan tumbuhan jenis daun.");
    }
}

// Subclass dari JenisDaun
class DaunMenyirip extends JenisDaun {
    public DaunMenyirip(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    public void pertumbuhan() {
        System.out.println(getNama() + " : tumbuhan dengan daun menyirip.");
    }
}

// Subclass dari JenisDaun
class DaunMenjari extends JenisDaun {
    public DaunMenjari(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    public void pertumbuhan() {
        System.out.println(getNama() + " : tumbuhan dengan daun menjari.");
    }
}

// Subclass dari JenisDaun
class DaunMelengkung extends JenisDaun {
    public DaunMelengkung(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    public void pertumbuhan() {
        System.out.println(getNama() + " : tumbuhan dengan daun melengkung.");
    }
}

// Subclass dari JenisDaun
class DaunSejajar extends JenisDaun {
    public DaunSejajar(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    
    public void pertumbuhan() {
        System.out.println(getNama() + "tumbuhan dengan daun sejajar.");
    }
}

// Subclass dari Tumbuhan
class JenisAkar extends Tumbuhan {
    public JenisAkar(String nama) {
        super(nama);
    }

    
    public void pertumbuhan() {
        System.out.println("Pertumbuhan tumbuhan jenis akar.");
    }
}

// Subclass dari JenisAkar
class AkarTunggang extends JenisAkar {
    public AkarTunggang(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    
    public void pertumbuhan() {
        System.out.println(getNama() + ": tumbuhan dengan akar tunggang.");
    }
}

// Subclass dari JenisAkar
class AkarSerabut extends JenisAkar {
    public AkarSerabut(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    
    public void pertumbuhan() {
        System.out.println(getNama() + " : tumbuhan dengan akar serabut.");
    }
}

// Subclass dari Tumbuhan
class Fotosintesis extends Tumbuhan {
    public Fotosintesis(String nama) {
        super(nama);
    }

    
    public void pertumbuhan() {
        System.out.println("Proses fotosintesis pada tumbuhan.");
    }
}

// Subclass dari Fotosintesis
class C2 extends Fotosintesis {
    public C2(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    
    public void pertumbuhan() {
        System.out.println(getNama() + " : Proses fotosintesis menggunakan mekanisme C2.");
    }
}

// Subclass dari Fotosintesis
class C3 extends Fotosintesis {
    public C3(String nama) {
        super(nama);
    }

    // Implementasi metode pertumbuhan
    
    public void pertumbuhan() {
        System.out.println(getNama() + " : Proses fotosintesis menggunakan mekanisme C3.");
    }
}

// Kelas utama untuk menjalankan program
public class tugas {
    public static void main(String[] args) {
        // Membuat objek Monokotil
        Monokotil padi = new Monokotil("Padi");
        padi.pertumbuhan();

        // Membuat objek Dikotil
        Dikotil kentang = new Dikotil("Kentang");
        kentang.pertumbuhan();

        // Membuat objek DaunMenyirip
        DaunMenyirip jeruk = new DaunMenyirip("Jeruk");
        jeruk.pertumbuhan();

        // Membuat objek AkarSerabut
        AkarSerabut pisang = new AkarSerabut("Pisang");
        pisang.pertumbuhan();

        // Membuat objek C2
        C3 c3Fotosintesis = new C3("Gandum");
        c3Fotosintesis.pertumbuhan();
    }
}
