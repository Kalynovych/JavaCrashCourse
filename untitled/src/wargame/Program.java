package wargame;

public class Program {
    public static void main(String[] args) {
        Army army1 = new Army();
        Army army2 = new Army();
        army1.addUnits(new Lancer());
        army2.addUnits(new Warrior());
        army2.addUnits(new Knight());
        boolean fightResult = WarGame.fight(army1, army2);
        System.out.println(fightResult);
    }

}
