package org.example.game3;

import org.springframework.stereotype.Component;

@Component
public class Cubs implements Team {
    @Override
    public String getName() {
        return "Chicago Cubs";
    }

}
