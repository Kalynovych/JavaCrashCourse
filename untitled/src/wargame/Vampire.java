package wargame;

public class Vampire extends Warrior {
    private int vampirism;
    public Vampire() {
        super(40, 4);
        vampirism = 50;
    }

    public void healing(int regen) {
        health += regen;
    }

    @Override
    public void equip_weapon(Weapon weapon)
    {
        super.equip_weapon(weapon);
        vampirism += weapon.vampirism;
        checkParameters();
    }

    @Override
    protected void checkParameters()
    {
        if (vampirism < 0) vampirism = 0;
        super.checkParameters();
    }

    @Override
    public int attack(Warrior defender) {
        int damage = super.attack(defender);
        healing(damage * vampirism / 100);
        return damage;
    }

}
