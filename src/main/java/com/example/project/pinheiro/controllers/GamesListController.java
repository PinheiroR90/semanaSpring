package com.example.project.pinheiro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.pinheiro.dto.GameDto;
import com.example.project.pinheiro.dto.GameListDto;
import com.example.project.pinheiro.dto.GameMinDto;
import com.example.project.pinheiro.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GamesListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDto> findAll() { 
		List<GameListDto> result = gameListService.findAll();
		return result;
	}

}
