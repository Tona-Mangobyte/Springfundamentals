package org.example.game2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        Game game = context.getBean("baseballGame", Game.class);
        System.out.println(game.playGame());

        /*System.out.println("Annotation Config Count beans: "+ context.getBeanDefinitionCount());
        for (String name :
                context.getBeanDefinitionNames()) {
            System.out.println(name);
        }*/
    }
}
