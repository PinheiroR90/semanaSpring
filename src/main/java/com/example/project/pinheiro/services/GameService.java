package com.example.project.pinheiro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.pinheiro.dto.GameDto;
import com.example.project.pinheiro.dto.GameMinDto;
import com.example.project.pinheiro.entities.GamesModel;
import com.example.project.pinheiro.projections.GameMinProjection;
import com.example.project.pinheiro.repositories.GamesRepository;

@Service
public class GameService {
	@Autowired
	private GamesRepository gamesRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll(){
		List<GamesModel> result = gamesRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		 GamesModel result = gamesRepository.findById(id).get();
		 GameDto dto = new GameDto(result);
		 return dto;
	}

	@Transactional(readOnly = true)
	public List<GameMinDto> findByGameList(Long listId) {
		List<GameMinProjection> games = gamesRepository.searchByList(listId);
		return games.stream().map(GameMinDto::new).toList();
	}
}
