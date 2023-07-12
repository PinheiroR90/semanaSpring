package com.example.project.pinheiro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.pinheiro.dto.GameListDto;
import com.example.project.pinheiro.entities.GameList;
import com.example.project.pinheiro.repositories.GamesListRepository;

@Service
public class GameListService {
	@Autowired
	private GamesListRepository gamesListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDto> findAll(){
		List<GameList> result = gamesListRepository.findAll();
		List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
		return dto;
	}
	
}
