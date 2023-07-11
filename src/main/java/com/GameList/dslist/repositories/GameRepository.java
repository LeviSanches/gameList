package com.GameList.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GameList.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
