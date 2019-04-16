package UTN.Model;

import UTN.Interfaces.Pishable;
import java.util.Random;

import static UTN.Utility.Colors.ANSI_GREEN;

public class SpartanPee implements Pishable {
    @Override
    public int pee(int a) {
        Random random = new Random();
        System.out.println(ANSI_GREEN + "Spartan went to pee, he loses because he is a pussy.");
        return a - random.nextInt((20 - 10) + 1) + 10;

    }
}
