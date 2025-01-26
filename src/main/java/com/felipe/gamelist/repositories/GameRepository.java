package com.felipe.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.gamelist.Entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>  {
    

}
