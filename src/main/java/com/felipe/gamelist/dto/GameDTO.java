package com.felipe.gamelist.dto;

import com.felipe.gamelist.Entities.Game;

import lombok.Getter;

@Getter
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String genre;
    private String platforms;
    private Double score;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game game) {
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        imgUrl = game.getImgUrl();
        genre = game.getGenre();
        platforms = game.getPlatforms();
        score = game.getScore();
        shortDescription = game.getShortDescription();
        longDescription = game.getLongDescription();
    }
}
