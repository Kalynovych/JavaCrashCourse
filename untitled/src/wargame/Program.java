package wargame;

public class Program {
    public static void main(String[] args) {
        Army army1 = new Army();
        Army army2 = new Army();
        army1.addUnits(new Warrior());
        army1.equipUnit(0, new Katana());
        army2.addUnits(new Defender());
        boolean fightResult = WarGame.straightFight(army1, army2);
        System.out.println(fightResult);
    }

}
