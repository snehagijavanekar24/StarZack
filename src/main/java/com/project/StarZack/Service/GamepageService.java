package com.project.StarZack.Service;

import java.util.List;

import com.project.StarZack.Entity.Gamepage;



public interface GamepageService {
	
	public String CreateGamepageDetails(Gamepage gamepage);
	public String updateGamepageDetails(Gamepage gamepage);
	public String deleteGamepageDetails(String GameId);
	public Gamepage getGamepageDetails(String GameId);
	public List<Gamepage> getAllGamepageDetails();
	List<Gamepage> getAllGamepage();

}
