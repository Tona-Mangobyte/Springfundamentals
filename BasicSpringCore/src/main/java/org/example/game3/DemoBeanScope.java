package org.example.game3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoBeanScope {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig2.class);
        Team royals = context.getBean("royals", Team.class);

        Game game1 = context.getBean("game", Game.class);
        System.out.println(game1);

        Game game2 = context.getBean("game", Game.class);
        game2.setHomeTeam(royals);
        System.out.println(game2);

        System.out.println(game1);
    }
}
