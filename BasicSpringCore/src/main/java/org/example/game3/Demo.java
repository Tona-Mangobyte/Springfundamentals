package org.example.game3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        Game game = context.getBean("game", Game.class);
        System.out.println(game.playGame());

        Team royals = context.getBean("royals", Team.class);
        game.setHomeTeam(royals);
        System.out.println(game.playGame());
    }
}
