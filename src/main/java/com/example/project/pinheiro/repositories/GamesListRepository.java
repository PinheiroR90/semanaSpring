package com.example.project.pinheiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.pinheiro.entities.GameList;

public interface GamesListRepository extends JpaRepository<GameList, Long> {

}
