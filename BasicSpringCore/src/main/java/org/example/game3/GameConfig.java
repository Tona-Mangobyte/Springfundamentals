package org.example.game3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example.game3")
public class GameConfig {

    @Autowired
    private List<Team> teams;

    @Bean // @Scope("singleton") by default
    public Game game() {
        return new BaseballGame(teams.get(0), teams.get(1));
    }

}
