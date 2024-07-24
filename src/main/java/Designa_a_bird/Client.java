package Designa_a_bird;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bird b = new Crow("steven", "Black", 5, 20);
        System.out.println(b.getWeight());
        ((Crow) b).fly();
        ((Crow) b).dance();
        b = new Penguin("Mike", "white", 2, 45);
        System.out.println(b.getWeight());
//        ((Penguin) b).fly(); // this indicates that this method is not present in the penguin class
        System.out.println(b.name);
        ((Penguin) b).dance();

        List<Bird> birds = new ArrayList<>();
        birds.add(new Crow("steven", "Black", 5, 20));
        birds.add(new Penguin("Mike", "white", 2, 45));
        System.out.println(birds.get(0));
    }
}
