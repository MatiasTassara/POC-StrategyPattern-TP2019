package UTN;
import UTN.Model.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Human v1 = new Viking("Ragnar",35,77,new VikingPee(),new VikingDrink(),12);
        Human v2 = new Viking("Floki",44,60,new VikingPee(),new VikingDrink(),11);
        Human v3 = new Viking("Olaf",64,90,new VikingPee(),new VikingDrink(),14);
        Human v4 = new Viking("Asterix",55,110,new VikingPee(),new VikingDrink(),12);
        Human v5 = new Viking("Obelix",47,88,new VikingPee(),new VikingDrink(),13);
        List<Human> vikingList = new ArrayList<>();
        Collections.addAll(vikingList,v1,v2,v3,v4,v5);
        Human s1 = new Spartan("Leonidas",40,80,new SpartanPee(),new SpartanDrink(),50);
        Human s2 = new Spartan("Pepe",34,88,new SpartanPee(),new SpartanDrink(),50);
        Human s3 = new Spartan("Cacho",55,67,new SpartanPee(),new SpartanDrink(),50);
        Human s4 = new Spartan("Chicho",67,140,new SpartanPee(),new SpartanDrink(),50);
        Human s5 = new Spartan("Coco",46,250,new SpartanPee(),new SpartanDrink(),50);
        List<Human> spartanList = new ArrayList<>();
        Collections.addAll(spartanList,s1,s2,s3,s4,s5);
        Human mutantBarTender = new Mutant("Moe Sislak",59,50,new SpartanPee(),new VikingDrink(),40);

        Tavern tavern = new Tavern(vikingList,spartanList,mutantBarTender);
        tavern.battle();



    }
}
