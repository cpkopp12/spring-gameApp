package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GamerRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
//import com.in28minutes.learnspringframework.game.MarioGame;
//import com.in28minutes.learnspringframework.game.SuperContraGame;
//import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
	
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingAppLauncherApplication.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GamerRunner.class).run();
			
		}

	}

}


