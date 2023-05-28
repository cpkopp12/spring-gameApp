package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

//import com.in28minutes.learnspringframework.game.MarioGame;
//import com.in28minutes.learnspringframework.game.SuperContraGame;
//import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ComponentScan
public class Excercise1 {
	
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(Excercise1.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessClacService.class).findMax());
			
		}

	}

}


