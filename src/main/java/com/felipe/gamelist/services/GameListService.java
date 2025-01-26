package com.felipe.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipe.gamelist.Entities.GameList;
import com.felipe.gamelist.dto.GameListDTO;
import com.felipe.gamelist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAllGameList() {
        List<GameList> resposta = gameListRepository.findAll();
        List<GameListDTO> dto = resposta.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
