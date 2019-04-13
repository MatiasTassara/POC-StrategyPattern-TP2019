package UTN.Model;

import UTN.Interfaces.Drinkable;

import java.util.Random;

public class SpartanDrink implements Drinkable {
    @Override
    public int drink() {
        Random drink = new Random();
        return drink.nextInt((15 - 10) + 1) + 10;
    }
}
