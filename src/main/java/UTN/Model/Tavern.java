package UTN.Model;

import UTN.Dao.AccessDB;
import java.util.*;
import java.util.stream.Collectors;
import static UTN.Utility.Colors.*;

public class Tavern {

    private List<Human> vikingList;
    private List<Human> spartanList;
    private List<Human> winners;
    private Human moeSislak;

    public Tavern(List<Human> vikingList, List<Human> spartanList, Human moeSislak) {
        this.vikingList = vikingList;
        this.spartanList = spartanList;
        this.winners = new ArrayList<>();
        this.moeSislak = moeSislak;
    }

    public void battle(){
        int vikingScore,spartanScore;
        setVikingList(sortCompetitors(getVikingList()));
        System.out.println(ANSI_BLUE + "Vikings team (sorted by age): " + getVikingList());
        setSpartanList(sortCompetitors(getSpartanList()));
        System.out.println(ANSI_GREEN + "Spartan's team (sorted by age): " + getSpartanList());

        while(getSpartanList().size() > 0 && getVikingList().size() > 0) {

            Viking viking = (Viking) getContender(getVikingList());
            Spartan spartan = (Spartan) getContender(getSpartanList());
            System.out.println(ANSI_BLUE + "Next viking to drink: " + viking.getName());
            System.out.println(ANSI_GREEN + "Next spartan to drink: " + spartan.getName());

            vikingScore = viking.getProDrinker() + viking.getaDrink().drink();
            viking.setBeer(vikingScore);
            System.out.println(ANSI_BLUE + "Viking " + viking.getName() + " drinking score is: " + vikingScore);
            spartanScore = spartan.getExtraTolerance() + spartan.getaDrink().drink();
            spartan.setBeer(spartanScore);
            System.out.println(ANSI_GREEN + "Spartan " + spartan.getName() + " drinking score is: " + spartanScore);
            if (spartanScore > vikingScore) {
                viking.getaBitofPee().pee();
                Spartan.setPoints(Spartan.getPoints() + 1);
                winners.add(spartan);
                }
            else if (vikingScore > spartanScore) {
                spartan.getaBitofPee().pee();
                Viking.setPoints(Viking.getPoints() + 1);
                winners.add(viking);
            }
            else{
                viking.getaBitofPee().pee();
                spartan.getaBitofPee().pee();
                System.out.println(ANSI_YELLOW + "This is a tie, both the viking and the spartan are pussys.");
            }
        }
        System.out.println(ANSI_BLUE + "Viking's total score: " + Viking.getPoints());
        System.out.println(ANSI_GREEN + "Spartan's total score " + Spartan.getPoints());
        System.out.println(ANSI_RESET + "::::INDIVIDUAL WINNERS::::");
        for(Human h : winners){
            System.out.println(h.getClass().getSimpleName() + " " + h.getName());
        }

        finalBattle();
        AccessDB daoWinners = new AccessDB();
        daoWinners.connect();
        daoWinners.insertWinners(winners);

    }

    public void finalBattle(){
        int humanScore = 0;
        Human bestWinner = winners.stream()
                .max(Comparator.comparing(Human::getBeer))
                .get();
        if(bestWinner instanceof Viking){
            humanScore = ((Viking) bestWinner).getProDrinker();
        }
        else if(bestWinner instanceof Spartan){
            humanScore = ((Spartan) bestWinner).getExtraTolerance();
        }

        if(Viking.getPoints() != Spartan.getPoints()){
            humanScore = humanScore + bestWinner.getaDrink().drink();
             System.out.println(ANSI_RESET + "***** MOE VERSUS THE BEST " + bestWinner.getClass().getSimpleName() + " WINNER. *****");
             System.out.println("3,2,1....Drink!!!");
             int barTenderScore = ((Mutant)moeSislak).getTolerance() + moeSislak.getaDrink().drink();

             if(barTenderScore > humanScore){
                 bestWinner.getaBitofPee().pee();
                 System.out.println("Moe WINS... Fatality!!!");
                 moeSislak.setBeer(barTenderScore);
                 winners.add(moeSislak);
             }
             else if(humanScore > barTenderScore){
                 moeSislak.getaBitofPee().pee();
                 System.out.println(bestWinner.getName() + " wins!!!!");
                 winners.add(bestWinner);
             }
             else{
                 moeSislak.getaBitofPee().pee();
                 bestWinner.getaBitofPee().pee();
                 System.out.println("This is a tie.... so boring, a pussy doesn't deserve going to the DB");
             }
          }
          else{
              System.out.println(ANSI_YELLOW + "No one deserves to compete against Moe because both teams tied...(they are pussys). ");
          }
    }


    public List<Human> sortCompetitors(List<Human> list){
        list = list.stream()
                .sorted(Comparator.comparing(Human::getAge))
                .collect(Collectors.toList());
        return list;
    }

    public Human getContender(List<Human> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        Human human = list.get(index);
        list.remove(list.get(index));
        return human;
    }


    public List<Human> getVikingList() {
        return vikingList;
    }

    public void setVikingList(List<Human> vikingList) {
        this.vikingList = vikingList;
    }

    public List<Human> getSpartanList() {
        return spartanList;
    }

    public void setSpartanList(List<Human> spartanList) {
        this.spartanList = spartanList;
    }

    public List<Human> getWinners() {
        return winners;
    }

    public void setWinners(List<Human> winners) {
        this.winners = winners;
    }

    public Human getMoeSislak() {
        return moeSislak;
    }

    public void setMoeSislak(Human moeSislak) {
        this.moeSislak = moeSislak;
    }
}
