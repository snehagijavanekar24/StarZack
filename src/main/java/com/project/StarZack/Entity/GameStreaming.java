package com.project.StarZack.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stream_info")
public class GameStreaming {
	
	@Id
	private String StreamId;
	private String StramName;
	private String StramType;
	private String GameId;
	private String GameName;
	private String StreamDate;
	
	public GameStreaming() {
	
	}

	public GameStreaming(String streamId, String stramName, String stramType, String gameId, String gameName,
			String streamDate) {
		
		StreamId = streamId;
		StramName = stramName;
		StramType = stramType;
		GameId = gameId;
		GameName = gameName;
		StreamDate = streamDate;
	}

	public String getStreamId() {
		return StreamId;
	}

	public void setStreamId(String streamId) {
		StreamId = streamId;
	}

	public String getStramName() {
		return StramName;
	}

	public void setStramName(String stramName) {
		StramName = stramName;
	}

	public String getStramType() {
		return StramType;
	}

	public void setStramType(String stramType) {
		StramType = stramType;
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

	public String getStreamDate() {
		return StreamDate;
	}

	public void setStreamDate(String streamDate) {
		StreamDate = streamDate;
	}
	
	
	
	

}
