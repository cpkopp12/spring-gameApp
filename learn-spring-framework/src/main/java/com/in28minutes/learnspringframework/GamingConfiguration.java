package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GamerRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;


@Configuration
public class GamingConfiguration {
	
	@Bean 
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean 
	public GamerRunner gameRunner(GamingConsole game) {
		var gameRunner = new GamerRunner(game);
		return gameRunner;
	}
	
//	var game = new PacmanGame();
//	var game = new MarioGame();
//	var game = new SuperContraGame();
//	var gameRunner = new GamerRunner(game);
//	gameRunner.run();
	
}
