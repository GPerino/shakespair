package org.perino.shakespair.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlayerTest {
    @Test
    void createPlayerObject() {
        Player player = new Player("gab");
        assertEquals("gab", player.name);
    }
}
