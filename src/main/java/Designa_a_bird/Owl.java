package Designa_a_bird;

public class Owl extends Bird implements Flying{

    DancingBehaviour dance = new OwlPenguinDancingBehaviour();

    Owl(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    @Override
    public void fly() {
       dance.makeDance();
    }
}
