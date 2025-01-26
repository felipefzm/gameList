package com.felipe.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.gamelist.Entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
