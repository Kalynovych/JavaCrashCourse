package wargame;

public class Healer extends Warrior implements HealEventListener {
    private int healRate;

    public Healer() {
        super(60, 0);
        healRate = 2;
    }

    @Override
    public int attack(Warrior defender){
        if (defender instanceof Healer) {
            defender.health = 0;
            health = 0;
        }
        return 0;
    }
    @Override
    public void equip_weapon(Weapon weapon)
    {
        super.equip_weapon(weapon);
        healRate += weapon.healPower;
        checkParameters();
    }

    @Override
    protected void checkParameters()
    {
        if (healRate < 0) healRate = 0;
        super.checkParameters();
    }

    @Override
    public void setPrevUnit(Warrior unit){
        prevUnit = unit;
        prevUnit.heal.addListener(this);
    }

    public void heal(Warrior w) {
        w.health += healRate;
        if (w.health > w.maxHealth) w.health = w.maxHealth;
    }

}
