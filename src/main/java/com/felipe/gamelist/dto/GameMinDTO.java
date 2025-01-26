package com.felipe.gamelist.dto;

import com.felipe.gamelist.Entities.Game;
import com.felipe.gamelist.projections.GameMinProjection;

import lombok.Getter;

@Getter
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game gameDTO) {
        id = gameDTO.getId();
        title = gameDTO.getTitle();
        year = gameDTO.getYear();
        imgUrl = gameDTO.getImgUrl();
        shortDescription = gameDTO.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projectionDTO) {
        id = projectionDTO.getId();
        title = projectionDTO.getTitle();
        year = projectionDTO.getYear();
        imgUrl = projectionDTO.getImgUrl();
        shortDescription = projectionDTO.getShortDescription();
    }

}
