package org.example.game2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// @Component
public class Cubs implements Team {
    @Override
    public String getName() {
        return "Chicago Cubs";
    }
}
