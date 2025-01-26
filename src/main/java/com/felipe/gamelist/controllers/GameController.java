package com.felipe.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.felipe.gamelist.Entities.Game;
import com.felipe.gamelist.dto.GameDTO;
import com.felipe.gamelist.dto.GameMinDTO;
import com.felipe.gamelist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAllGames();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) { // Confirma o Id na rota
        GameDTO result = gameService.findGamesById(id);
        return result;
    }

}
