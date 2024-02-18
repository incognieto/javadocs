import java.util.Scanner;

public class latihanclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukan Brand Laptop      : ");
        String computerBrand = scanner.nextLine();
        System.out.print("Masukan Tipe Prosesor     : ");
        String processorType = scanner.nextLine();

        System.out.print("Masukan username Laptop   : ");
        String userName = scanner.nextLine();
        System.out.print("Masukan pin Laptop        : ");
        int userPass = scanner.nextInt();

        // Membuat objek Computer
        Computer myComputer = new Computer(computerBrand, processorType);

        // Membuat objek User
        User myUser = new User(userName, userPass);

        // Interaksi antara User dan Computer menggunakan dependensi
        myUser.login(myComputer);
        myUser.logout(myComputer);

        scanner.close();
    }
}

class Computer {
    private String brand;
    private String processor;

    public Computer(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }

    public void start() {
        System.out.println("Computer is starting...");
    }

    public void shutdown() {
        System.out.println("Computer is shutting down...");
    }

    public void displayInfo() {
        System.out.println("Computer brand          : " + brand);
        System.out.println("Processor               : " + processor);
    }
}

class User {
    private String name;
    private int Pass;

    public User(String name, int Pass) {
        this.name = name;
        this.Pass = Pass;
    }

    public void login(Computer computer) {
        System.out.println(name + " is logging in...");
        computer.start();
    }

    public void logout(Computer computer) {
        System.out.println(name + " is logging out...");
        computer.shutdown();
    }
}
