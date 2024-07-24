package Designa_a_bird;

import java.sql.SQLOutput;

public class  Crow extends Bird implements Flying,Dancing {

    FlyingBehaviour fly = new CrowEagleFlyingBehaviour();

    Crow(String name, String color, int age, int weight ) {
        super(name, color, age, weight);
    }


    @Override
    public void fly() {
        fly.makeFly();
    }

    @Override
    public void dance() {
        System.out.println("Crow is dancing");
    }
}
