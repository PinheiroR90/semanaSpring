package com.example.project.pinheiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.pinheiro.entities.BelongingPK;
import com.example.project.pinheiro.entities.GamesModel;

@Repository
public interface GamesRepository extends JpaRepository<GamesModel, Long> {

}
