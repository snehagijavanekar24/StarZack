package com.project.StarZack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Game_info")
public class Gamepage {
	@Id
	private String GameId;
	private String GameName;
	private String GameType;
	
	public Gamepage() {
		
	}

	public Gamepage(String gameId, String gameName, String gameType) {
		
		GameId = gameId;
		GameName = gameName;
		GameType = gameType;
	}

	public String getGameId() {
		return GameId;
	}

	public void setGameId(String gameId) {
		GameId = gameId;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public String getGameType() {
		return GameType;
	}

	public void setGameType(String gameType) {
		GameType = gameType;
	}
	
		
	
	
}
