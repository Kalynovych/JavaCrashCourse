package wargame;

public class Program {
    public static void main(String[] args) {
        Knight w1 = new Knight();
        Knight w2 = new Knight();
        boolean fightResult = WarGame.fight(w1, w2);
        System.out.println(fightResult);
    }

}
