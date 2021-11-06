package wargame;

class WarGame {
    public static boolean fight(Warrior w1, Warrior w2) {
        int round = 0;
        while (w1.isAlive() && w2.isAlive()) {
            if (round % 2 == 0) w2.changeHealth(w1.getAttack());
            else w1.changeHealth(w2.getAttack());
            round++;
        }
        return w1.isAlive();
    }

}
