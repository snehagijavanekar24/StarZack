package com.project.StarZack.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.StarZack.Entity.Gamepage;
import com.project.StarZack.Repository.GamepageRepository;
import com.project.StarZack.Service.GamepageService;

@Service
public class GamepageServiceImpl implements GamepageService {
	GamepageRepository gamerepo;
	

	public GamepageServiceImpl(GamepageRepository gamerepo) {
		
		this.gamerepo = gamerepo;
	}

	@Override
	public String CreateGamepageDetails(Gamepage gamepage) {
		gamerepo.save(gamepage);
		return "Success";
	}

	@Override
	public String updateGamepageDetails(Gamepage gamepage) {
		gamerepo.save(gamepage);
		return "Success";
	}

	@Override
	public String deleteGamepageDetails(String GameId) {
		gamerepo.deleteById(GameId);
		return "Success";
	}

	@Override
	public Gamepage getGamepageDetails(String GameId) {
		return gamerepo.findById(GameId).get();
	}

	@Override
	public List<Gamepage> getAllGamepageDetails() {
		return gamerepo.findAll();
	}

	@Override
	public List<Gamepage> getAllGamepage() {
		// TODO Auto-generated method stub
		return null;
	}

}
