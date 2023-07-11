package com.example.project.pinheiro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.pinheiro.dto.GameMinDto;
import com.example.project.pinheiro.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GamesController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDto> findAll() { 
		List<GameMinDto> result = gameService.findAll();
		return result;
	}

}
