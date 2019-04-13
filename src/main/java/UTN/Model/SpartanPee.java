package UTN.Model;

import UTN.Interfaces.Pishable;

import static UTN.Utility.Colors.ANSI_GREEN;

public class SpartanPee implements Pishable {
    @Override
    public void pee() {
        System.out.println(ANSI_GREEN + "Spartan went to pee, he loses because he is a pussy.");

    }
}
