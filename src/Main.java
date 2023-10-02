import animal.Animal;
import animal.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Markiza");
        cat.setWeight(2);

        cat.meow();
        cat.afiseazGreutatea();

        Animal animal = new Animal();

        animal.setWeight(1000);

    }
}