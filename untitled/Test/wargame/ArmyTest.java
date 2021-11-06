package wargame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    @Test
    void fight() {
        Army army1 = new Army();
        Army army2 = new Army();

        army1.addUnits(new Warrior());
        army1.addUnits(new Knight());
        army1.addUnits(new Knight());

        army2.addUnits(new Warrior());
        army2.addUnits(new Warrior());
        army2.addUnits(new Knight());

        var result1 = WarGame.fight(army1, army2);
        var result2 = WarGame.fight(army2, army1);

        assertTrue(result1, "First army should have won");
        assertFalse(result2, "First army should have won");
    }

}
