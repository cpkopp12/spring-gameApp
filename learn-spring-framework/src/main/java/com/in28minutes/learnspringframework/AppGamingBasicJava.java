package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GamerRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var game = new PacmanGame();
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var gameRunner = new GamerRunner(game);
		gameRunner.run();

	}

}
