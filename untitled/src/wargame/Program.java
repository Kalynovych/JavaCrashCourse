package wargame;

public class Program {
    public static void main(String[] args) {
        Warrior w1 = new Warrior();
        Defender w2 = new Defender();
        boolean fightResult = WarGame.fight(w1, w2);
        System.out.println(fightResult);
    }

}
