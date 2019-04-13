package UTN.Model;

import UTN.Interfaces.Drinkable;
import UTN.Interfaces.Pishable;

public class Mutant extends Human {

    private int tolerance;

    public Mutant(String name, int age, int weight, Pishable aBitofPee, Drinkable aDrink, int tolerance) {
        super(name, age, weight, aBitofPee, aDrink);
        this.tolerance = tolerance;
    }

    public int getTolerance() {
        return tolerance;
    }
    public void setTolerance(int tolerance) {
        this.tolerance = tolerance;
    }
}
