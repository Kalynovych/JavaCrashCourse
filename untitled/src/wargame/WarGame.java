package wargame;

class WarGame {
    public static boolean fight(Warrior w1, Warrior w2) {
        Warrior attacker = w1;
        Warrior defender = w2;
        while (attacker.isAlive()) {
            attacker.attack(defender);
            Warrior temp = attacker;
            attacker = defender;
            defender = temp;
        }
        return w1.isAlive();
    }

    public static boolean fight(Army a1, Army a2) {
        while (a1.isAlive() && a2.isAlive()) {
            boolean result =  fight(a1.get(0), a2.get(0));
            if (result) a2.tryDeleteUnits(0);
            else a1.tryDeleteUnits(0);
        }
        return a1.isAlive();
    }

    public static boolean straightFight(Army a1, Army a2){
        while (a1.isAlive() && a2.isAlive()) {
            int min = Math.min(a1.armySize(), a2.armySize());
            for (int i = 0; i < min; i++) fight(a1.get(i), a2.get(i));
            a1.deleteDeadUnits();
            a2.deleteDeadUnits();
        }
        return a1.isAlive();
    }

}
