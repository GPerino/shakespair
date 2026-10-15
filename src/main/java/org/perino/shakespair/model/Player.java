package org.perino.shakespair.model;

import java.util.UUID;

public class Player {
    public UUID identifier;
    public String name;
    public Integer score;
    public Integer elo;

    public Player(String name, Integer elo) {
        this.name = name;
        this.identifier = UUID.randomUUID();
        this.score = 0;
        this.elo = elo;
    }
}
