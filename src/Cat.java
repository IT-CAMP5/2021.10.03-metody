public class Cat {
    int age;
    String name;
    String race;

    Cat(int age, String name, String race) {
        this(age, name);
        this.race = race;
    }

    Cat(int age, String name) {
        this(name);
        this.age = age;
        System.out.println("Działa konstruktor !!");
    }

    Cat(String name) {
        this.name = name;
    }

    void mialcz() {
        System.out.println("Miał, mam " + this.age + " lat !!");
        System.out.println("Miał miał !!");
    }
}
