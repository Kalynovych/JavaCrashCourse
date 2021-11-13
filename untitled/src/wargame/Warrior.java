package wargame;

class Warrior {
    protected int health;
    protected int attack;
    protected final int maxHealth;
    protected Warrior nextUnit = null;
    protected Warrior prevUnit = null;
    protected HealEvent heal = new HealEvent();

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
        this.maxHealth = health;
    }

    public boolean isAlive() {
        if (nextUnit != null && !nextUnit.isAlive()){
            nextUnit = nextUnit.nextUnit;
            nextUnit.prevUnit = this;
        }
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int attack(Warrior defender){
        heal.onHeal(this);
        return defender.takeDamage(attack);
    }

    public int takeDamage(int damage) {
        if (damage < 0) return 0;
        health -= damage;
        return damage;
    }

    public void setNextUnit(Warrior unit){
        nextUnit = unit;
    }

    public Warrior getNextUnit(){
        return nextUnit;
    }

    public void setPrevUnit(Warrior unit){
        prevUnit = unit;
    }

    public Warrior getPrevUnit(){
        return prevUnit;
    }

    public int getAttack() {
        return attack;
    }

}
