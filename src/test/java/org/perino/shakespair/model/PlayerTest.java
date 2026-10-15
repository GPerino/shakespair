package org.perino.shakespair.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlayerTest {
    @Test
    void createPlayerObject() {
        Player player = new Player("gab", 1000);
        assertEquals("gab", player.name);
        assertEquals(0, player.score);
        assertEquals(1000, player.elo);
    }
}
