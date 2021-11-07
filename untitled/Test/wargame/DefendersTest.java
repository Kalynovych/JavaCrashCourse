package wargame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefendersTest {

    @Test
    void fight() {
        var chuck = new Defender();
        var bruce = new Knight();
        var carl = new Warrior();
        var dave = new Defender();

        var result1 = WarGame.fight(chuck, bruce);
        var result2 = WarGame.fight(dave, carl);

        assertFalse(result1, "Bruce should have won");
        assertTrue(result2, "Carl should have lost");

        assertFalse(chuck.isAlive());
        assertTrue(bruce.isAlive());
        assertFalse(carl.isAlive());
        assertTrue(dave.isAlive());
    }

}