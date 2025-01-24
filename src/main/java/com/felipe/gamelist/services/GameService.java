package com.felipe.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.gamelist.Entities.Game;
import com.felipe.gamelist.dto.GameMinDTO;
import com.felipe.gamelist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAllGames() {
        List<Game> resposta = gameRepository.findAll();
        List<GameMinDTO> dto = resposta.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
