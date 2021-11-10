package wargame;

class Warrior {
    protected int health;
    protected int attack;
    protected Warrior nextUnit = null;

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public boolean isAlive() {
        if (nextUnit != null && !nextUnit.isAlive()) nextUnit = nextUnit.nextUnit;
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int attack(Warrior defender){
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

    public int getAttack() {
        return attack;
    }

}
