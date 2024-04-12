package com.project.StarZack.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Category_info")
public class Category {
	
	@Id

	private String UserName;
	private String GameId;
	private String GameName;
	private String GameType;
	private String PlayerType;
	
	public Category() {
		
	}

	public Category( String userName, String gameId, String gameName, String gameType,
			String playerType) {
		

		UserName = userName;
		GameId = gameId;
		GameName = gameName;
		GameType = gameType;
		PlayerType = playerType;
	}
	

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
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

	public String getPlayerType() {
		return PlayerType;
	}

	public void setPlayerType(String playerType) {
		PlayerType = playerType;
	}
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private  User user;

}
