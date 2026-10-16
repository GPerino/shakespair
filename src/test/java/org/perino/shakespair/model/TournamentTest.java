package org.perino.shakespair.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TournamentTest {
    Player player1 = new Player("player1", 1000);
    Tournament tournament = new Tournament("Julien Song cup", 5);

    @Test
    public void TestPlayerRegistration() {
        tournament.PlayerRegistration(player1);
        assertEquals(1, tournament.players.size());
        assertEquals(1, player1.identifier);
    }
}