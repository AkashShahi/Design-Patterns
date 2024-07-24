package Designa_a_bird;

public abstract class Bird {
    public String name;
    public String color;
    public int age;
    public int weight;

    Bird(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String toString() {
        return "Bird{name ='" + name + "', color ='" + color + "', age =" + age + ", weight =" + weight + "}";
    }

    int getWeight() {
        return weight;
    }

    void walk() {
        System.out.println("Bird is walking");
    }

}
