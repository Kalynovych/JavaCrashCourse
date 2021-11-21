package wargame;

public class Program {
    public static void main(String[] args) {
        Army army1 = new Army();
        Army army2 = new Army();
        army1.addStraightUnit(new Warrior());
        army1.addStraightUnit(new Warrior());
        army1.addStraightUnit(new Knight());
        army2.addStraightUnit(new Knight());
        army2.addStraightUnit(new Healer());
        army2.addStraightUnit(new Knight());
        boolean fightResult = WarGame.straightFight(army1, army2);
        System.out.println(fightResult);
    }

}
