package UTN.Model;

import UTN.Interfaces.Drinkable;
import UTN.Interfaces.Pishable;

public class Spartan extends Human{
    private int extraTolerance;
    private static int points = 0;

    public Spartan(String nombre, int edad, int peso, Pishable aBitofPee, Drinkable aDrink, int extraTolerance) {
        super(nombre, edad, peso, aBitofPee, aDrink);
        this.extraTolerance = extraTolerance;
    }


    public int getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(int extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    public static int getPoints() {
        return points;
    }

    public static void setPoints(int points) {
        Spartan.points = points;
    }

    @Override
    public String toString() {
        return super.toString() + " - Extra tolerance: " + getExtraTolerance();
    }
}
