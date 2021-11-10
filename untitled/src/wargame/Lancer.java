package wargame;

public class Lancer extends Warrior {
    public Lancer() {
        super(50, 6);
    }

    @Override
    public int attack(Warrior defender) {
        return defender.getNextUnit() != null ? defender.getNextUnit().takeDamage(defender.takeDamage(attack) / 2) : defender.takeDamage(attack);
    }

}
