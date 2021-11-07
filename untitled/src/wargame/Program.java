package wargame;

public class Program {
    public static void main(String[] args) {
        Defender w1 = new Defender();
        Vampire w2 = new Vampire();
        boolean fightResult = WarGame.fight(w1, w2);
        System.out.println(fightResult);
    }

}
