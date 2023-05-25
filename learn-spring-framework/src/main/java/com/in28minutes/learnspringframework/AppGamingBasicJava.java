package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GamerRunner;
import com.in28minutes.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GamerRunner(marioGame);
		gameRunner.run();

	}

}
