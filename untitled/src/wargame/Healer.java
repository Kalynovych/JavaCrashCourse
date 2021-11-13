package wargame;

public class Healer extends Warrior implements HealEventListener {
    private int healRate;

    public Healer() {
        super(60, 0);
        healRate = 2;
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
