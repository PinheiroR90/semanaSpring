package com.example.project.pinheiro.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_name")
public class GamesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String genre;
	@Column(name = "game_year")
	private Integer year;
	private String platforms;
	private Double scores;
	private String imgUrl;
	private String shortDescripotion;
	private String longDescription;
	
	public GamesModel() {
	}
	
	public GamesModel(Long id, String title, String genre, Integer year, String platforms, Double scores, String imgUrl,
			String shortDescripotion, String longDescription) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.platforms = platforms;
		this.scores = scores;
		this.imgUrl = imgUrl;
		this.shortDescripotion = shortDescripotion;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScores() {
		return scores;
	}

	public void setScores(Double scores) {
		this.scores = scores;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescripotion() {
		return shortDescripotion;
	}

	public void setShortDescripotion(String shortDescripotion) {
		this.shortDescripotion = shortDescripotion;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GamesModel other = (GamesModel) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
