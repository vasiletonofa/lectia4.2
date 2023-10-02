package animal;

public class Cat extends Animal implements Erbivor, Carnivor {

    public void meow() {
        System.out.println("Meow " + name);
    }

    public void afiseazGreutatea() {
        System.out.println("Greutatea este: " + getWeight());
    }

}
