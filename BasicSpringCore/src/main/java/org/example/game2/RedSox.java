package org.example.game2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// @Component
public class RedSox implements Team {
    @Override
    public String getName() {
        return "Boston Red Sox";
    }
}
