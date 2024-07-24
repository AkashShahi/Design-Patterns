package Designa_a_bird;

public class Eagle extends Bird implements Flying{

    FlyingBehaviour fly = new CrowEagleFlyingBehaviour();

    Eagle(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    @Override
    public void fly() {
        fly.makeFly();
    }
}
