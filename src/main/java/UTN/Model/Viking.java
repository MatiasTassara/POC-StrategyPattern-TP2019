package UTN.Model;

import UTN.Interfaces.Drinkable;
import UTN.Interfaces.Pishable;

public class Viking extends Human {
    private int proDrinker;
    private static int points = 0;

    public Viking(String nombre, int edad, int peso, Pishable aBitofPee, Drinkable aDrink, int proDrinker) {
        super(nombre, edad, peso, aBitofPee, aDrink);
        this.proDrinker = proDrinker;
    }


    public int getProDrinker() {
        return proDrinker;
    }

    public void setProDrinker(int proDrinker) {
        this.proDrinker = proDrinker;
    }

    public static int getPoints() {
        return points;
    }

    public static void setPoints(int points) {
        Viking.points = points;
    }

    @Override
    public String toString() {
        return super.toString() + " - Pro Drinker: " + getProDrinker();
    }
}
