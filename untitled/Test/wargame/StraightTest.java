package wargame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StraightTest {

    @Test
    void straightFight() {
        Army army1 = new Army();
        Army army2 = new Army();
        army1.addStraightUnit(new Warrior());
        army1.addStraightUnit(new Warrior());
        army1.addStraightUnit(new Knight());
        army2.addStraightUnit(new Knight());
        army2.addStraightUnit(new Healer());
        army2.addStraightUnit(new Knight());

        var result1 = WarGame.straightFight(army1, army2);
        assertTrue(result1, "First army should have won");
        assertTrue(army1.isAlive());
        assertFalse(army2.isAlive());
        assertEquals(army1.get(0).getHealth(), 43);
        assertEquals(army1.get(1).getHealth(), 1);
    }

}
