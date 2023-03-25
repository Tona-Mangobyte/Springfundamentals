package org.example.game2;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// @Component
public class BaseballGame implements Game {
    private Team homeTeam;

    private Team awayTeam;
    public BaseballGame(@Qualifier("redSox") Team homeTeam, @Qualifier("cubs") Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String playGame() {
        if (getHomeTeam() == null || getAwayTeam() == null) {
            return "Can not play";
        }
        return Math.random() < 0.5 ?
                getHomeTeam().getName() :
                getAwayTeam().getName();
    }
}
