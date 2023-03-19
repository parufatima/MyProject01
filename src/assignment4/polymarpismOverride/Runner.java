package assignment4.polymarpismOverride;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cow cow = new Cow();
        Sheep sheep = new Sheep();
        Tiger tiger = new Tiger();

        animal.sound();
        cow.sound();
        sheep.sound();
        tiger.sound();
    }
}
