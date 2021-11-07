package wargame;

class Warrior {
    protected int health;
    protected int attack;

    public Warrior() {
        this(50, 5);
    }

    protected Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int takeDamage(Warrior attacker) {
        int damage = attacker.getAttack();
        return takeDamage(damage);
    }

    public int takeDamage(int damage) {
        if (damage < 0) return 0;
        health -= damage;
        return damage;
    }

    public int getAttack() {
        return attack;
    }

}
