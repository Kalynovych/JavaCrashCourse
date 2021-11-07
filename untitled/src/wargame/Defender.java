package wargame;

public class Defender extends Warrior {
    private int defence;
    public Defender() {
        super(60, 3);
        defence = 2;
    }

    @Override
    public int takeDamage(int damage) {
        return damage > defence ? super.takeDamage(damage - defence) : 0;
    }

}
