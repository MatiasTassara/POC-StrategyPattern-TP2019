package UTN.Model;


import UTN.Interfaces.Drinkable;
import UTN.Interfaces.Pishable;

public class Human {
    private String name;
    private int age;
    private int weight;
    private Pishable aBitofPee;
    private Drinkable aDrink;
    private int beer;

    public Human(String name, int age, int weight, Pishable aBitofPee, Drinkable aDrink) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.aBitofPee = aBitofPee;
        this.aDrink = aDrink;
        this.beer = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Pishable getaBitofPee() {
        return aBitofPee;
    }

    public void setaBitofPee(Pishable aBitofPee) {
        this.aBitofPee = aBitofPee;
    }

    public Drinkable getaDrink() {
        return aDrink;
    }

    public void setaDrink(Drinkable aDrink) {
        this.aDrink = aDrink;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBeer() {
        return beer;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " - Age: " + getAge() + " - Weight: " + getWeight();
    }
}
