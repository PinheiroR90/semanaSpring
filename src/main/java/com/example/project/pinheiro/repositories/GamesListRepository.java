package com.example.project.pinheiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.pinheiro.entities.GameList;

@Repository
public interface GamesListRepository extends JpaRepository<GameList, Long> {

}
