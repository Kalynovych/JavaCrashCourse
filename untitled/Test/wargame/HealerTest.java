package wargame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealerTest {

    @Test
    void fight() {
        Army army1 = new Army();
        Army army2 = new Army();

        army1.addUnits(new Lancer());

        army2.addUnits(new Warrior());
        army2.addUnits(new Healer());

        var result1 = WarGame.fight(army1, army2);

        assertFalse(result1, "Second army should have won");
        assertFalse(army1.isAlive());
        assertTrue(army2.isAlive());
        assertEquals(army2.get(0).getHealth(), 10);
        assertEquals(army2.get(1).getHealth(), 30);
    }
}