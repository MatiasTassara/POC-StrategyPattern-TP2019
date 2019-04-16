package UTN.Model;

import UTN.Interfaces.Pishable;

import java.util.Random;

import static UTN.Utility.Colors.ANSI_BLUE;


public class VikingPee implements Pishable {
    @Override
    public int pee(int a) {
        Random random = new Random();
        System.out.println(ANSI_BLUE +  "Viking went to the bathroom, so he is a pussy and loses.");
        return  a - random.nextInt((12 - 6) + 1) + 6;
    }
}
