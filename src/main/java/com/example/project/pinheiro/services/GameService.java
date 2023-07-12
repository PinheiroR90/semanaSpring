package com.example.project.pinheiro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.pinheiro.dto.GameMinDto;
import com.example.project.pinheiro.entities.GamesModel;
import com.example.project.pinheiro.repositories.GamesRepository;

@Service
public class GameService {
	@Autowired
	private GamesRepository gameRepository;
	
	public List<GameMinDto> findAll(){
		List<GamesModel> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}
	
	public GameDto findById(Long id) {
		 GamesModel result = gameRepository.findById(id).get();
		 GameDto dto = new GameDto(result);
		 return dto;
	}
}
