package org.perino.shakespair.model;

public class Player {
    public Integer identifier;
    public String name;
    public Integer score;
    public Integer elo;

    public Player(String name, Integer elo) {
        this.name = name;
        this.score = 0;
        this.elo = elo;
    }
}
