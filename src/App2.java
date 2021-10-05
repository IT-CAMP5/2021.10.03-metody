public class App2 {
    public static void main(String[] args) {
        a();
        System.out.println("Koniec maina !!");
    }

    public static void a() {
        b();
        System.out.println("Zakończyła się metoda A !!");
    }

    public static void b() {
        c();
        System.out.println("Zakończyła się metoda B !!");
    }

    public static void c() {
        d();
        System.out.println("Zakończyła się metoda C !!");
    }

    public static void d() {
        a();
        System.out.println("Metoda D !!");
    }
}
