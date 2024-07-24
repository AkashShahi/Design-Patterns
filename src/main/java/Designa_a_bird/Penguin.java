package Designa_a_bird;

public class Penguin extends Bird implements Dancing{

    DancingBehaviour dance = new OwlPenguinDancingBehaviour();

    Penguin(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    @Override
    public void dance() {
       dance.makeDance();
    }
}
