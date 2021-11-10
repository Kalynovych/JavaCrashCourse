package wargame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LancerTest {

    @Test
    void fight() {
        Army army1 = new Army();
        Army army2 = new Army();

        army1.addUnits(new Lancer());

        army2.addUnits(new Warrior());
        army2.addUnits(new Knight());

        var result1 = WarGame.fight(army1, army2);
        assertFalse(result1, "Second army should have won");
    }
}