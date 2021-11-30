package wargame;

public class Defender extends Warrior {
    private int defence;
    public Defender() {
        super(60, 3);
        defence = 2;
    }
    @Override
    public void equip_weapon(Weapon weapon)
    {
        super.equip_weapon(weapon);
        defence = weapon.defense;
        checkParameters();
    }

    @Override
    protected void checkParameters()
    {
        if (defence < 0) defence = 0;
        super.checkParameters();
    }

    @Override
    public int takeDamage(int damage) {
        return damage > defence ? super.takeDamage(damage - defence) : 0;
    }

}
