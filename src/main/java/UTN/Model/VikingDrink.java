package UTN.Model;

import UTN.Interfaces.Drinkable;
import java.util.Random;

public class VikingDrink implements Drinkable {
    @Override
    public int drink() {
        Random drink = new Random();
        return drink.nextInt((60 - 35) + 1) + 35;
    }
}
