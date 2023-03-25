package org.example.game2;

public interface Game {
    Team getHomeTeam();
    void setHomeTeam(Team team);
    Team getAwayTeam();
    void setAwayTeam(Team team);
    String playGame();
}
