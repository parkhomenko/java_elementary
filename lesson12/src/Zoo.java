/**
 * Created by User on 28.04.2016.
 */
public class Zoo {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice();

        Dog dog = new Dog();
        dog.voice();

        Parrot parrot = new Parrot();
        parrot.voice();

        //Animal animal = new Animal();
        //animal.voice();

        //animal.walk();
        parrot.walk();
        cat.walk();
    }
}
