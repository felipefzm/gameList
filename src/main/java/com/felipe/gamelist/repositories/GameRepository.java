package com.felipe.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gamelist.Entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>  {
    

}
