package wargame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    void fight() {
        var chuck = new Warrior();
        var carl = new Knight();
        chuck.equip_weapon(new Sword());
        carl.equip_weapon(new Katana());

        var result1 = WarGame.fight(chuck, carl);
        assertTrue(result1, "Chuck should have won");
        assertTrue(chuck.isAlive());
        assertFalse(carl.isAlive());
        assertEquals(chuck.getHealth(), 3);
        assertEquals(carl.getHealth(), -5);
    }
}