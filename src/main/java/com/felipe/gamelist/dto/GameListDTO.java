package com.felipe.gamelist.dto;

import com.felipe.gamelist.Entities.GameList;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameListDTO {

    private Long id;

    private String name;

    public GameListDTO(GameList gameList){
        this.id = gameList.getId();
        this.name = gameList.getName();
    }
}
