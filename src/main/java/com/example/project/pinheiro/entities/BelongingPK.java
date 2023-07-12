package com.example.project.pinheiro.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	@ManyToOne
	@JoinColumn(name = "game_id")
    private GamesModel gameModel;
	@ManyToOne
	@JoinColumn(name= "list_id")
	private GameList gameList;
	
	public BelongingPK() {
	}

	public BelongingPK(GamesModel gameModel, GameList gameList) {
		super();
		this.gameModel = gameModel;
		this.gameList = gameList;
	}

	public GamesModel getGameModel() {
		return gameModel;
	}

	public void setGameModel(GamesModel gameModel) {
		this.gameModel = gameModel;
	}

	public GameList getGameList() {
		return gameList;
	}

	public void setGameList(GameList gameList) {
		this.gameList = gameList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gameList, gameModel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(gameList, other.gameList) && Objects.equals(gameModel, other.gameModel);
	}
	
}
