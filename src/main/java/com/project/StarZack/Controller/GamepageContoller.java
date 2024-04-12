package com.project.StarZack.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.StarZack.Entity.Gamepage;
import com.project.StarZack.Service.GamepageService;


@RestController
@RequestMapping("/Gamepage")
public class GamepageContoller {

	 GamepageService gameservice;
	 
		

		public GamepageContoller(GamepageService gameservice) {
		
		this.gameservice = gameservice;
	}

		@GetMapping("{GameId}")
	    public Gamepage getGamepageDetails(@PathVariable("GameId") String GameId){
	        return gameservice.getGamepageDetails(GameId);
	    }

	    @GetMapping()
	    public List <Gamepage> getAllGamepageDetails(){
	        return gameservice.getAllGamepageDetails();
	    }

	    @PostMapping
	    public String createGamepageDetails(@RequestBody Gamepage gamepage){
	        gameservice.CreateGamepageDetails(gamepage);
	        return "Games Created Successfully";
	    }

	    @PutMapping
	    public String updateGamepageDetails(@RequestBody Gamepage gamepage){
	    	gameservice.updateGamepageDetails(gamepage);
	        return "Games Updated Successully";
	    }

	    @DeleteMapping("{GameId}")
	    public String deleteGamepageDetails(@PathVariable("GameId")String GameId){
	    	gameservice.deleteGamepageDetails(GameId);
	        return "Game Deleted Successfully";
	    }
}
