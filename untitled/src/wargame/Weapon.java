package wargame;

public abstract class Weapon {
    protected Weapon(int health, int attack, int defense, int vampirism, int healPower)
    {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.vampirism = vampirism;
        this.healPower = healPower;
    }
    int health, attack, defense, vampirism, healPower;
}
