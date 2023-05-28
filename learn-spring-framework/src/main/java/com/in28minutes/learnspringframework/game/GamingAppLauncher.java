package com.in28minutes.learnspringframework.game;

//import com.in28minutes.learnspringframework.game.MarioGame;
//import com.in28minutes.learnspringframework.game.SuperContraGame;
//import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncher {
	
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingAppLauncher.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
			
		}

	}

}


