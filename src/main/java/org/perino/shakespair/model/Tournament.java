package org.perino.shakespair.model;

import java.util.ArrayList;

public class Tournament {
    String name;
    ArrayList<Player> players = new ArrayList<>();
    Integer RoundNumber;

    public Tournament(String name, Integer roundNumber) {
        this.name = name;
        this.RoundNumber = roundNumber;
    }

    public void PlayerRegistration(Player player) {
        players.add(player);
        player.identifier = this.players.size();
    }
}
