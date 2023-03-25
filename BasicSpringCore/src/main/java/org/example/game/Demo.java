package org.example.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        Game game = context.getBean("game", Game.class);
        // Team redSox = context.getBean("redSox", Team.class);
        // System.out.println(redSox.getName());
        System.out.println(game.playGame());

        context = new ClassPathXmlApplicationContext("game.xml");
        game = context.getBean("game", Game.class);
        // Team redSox = context.getBean("redSox", Team.class);
        // System.out.println(redSox.getName());
        System.out.println(game.playGame());
    }
}
