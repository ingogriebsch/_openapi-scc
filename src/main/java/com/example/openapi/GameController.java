package com.example.openapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GameController {

    @GetMapping("/games")
    public List<Game> listGames() {
        return List.of(new Game(new Player(new Name("John", "Doe"))));
    }
}
