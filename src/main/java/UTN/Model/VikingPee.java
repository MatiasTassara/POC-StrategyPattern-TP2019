package UTN.Model;

import UTN.Interfaces.Pishable;
import static UTN.Utility.Colors.ANSI_BLUE;


public class VikingPee implements Pishable {
    @Override
    public void pee() {
        System.out.println(ANSI_BLUE +  "Viking went to the bathroom, so he is a pussy and loses.");
    }
}
