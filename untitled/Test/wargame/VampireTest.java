package wargame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VampireTest {
    @Test
    void fight() {
        var jim = new Knight();
        var bruce = new Defender();
        var chuck = new Vampire();
        var dave = new Vampire();

        var result1 = WarGame.fight(bruce, chuck);
        var result2 = WarGame.fight(jim, dave);

        assertTrue(result1, "Bruce should have won");
        assertTrue(result2, "Jim should have lost");

        assertFalse(chuck.isAlive());
        assertTrue(bruce.isAlive());
        assertTrue(jim.isAlive());
        assertFalse(dave.isAlive());
    }

}