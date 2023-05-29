package com.in28minutes.learnspringframework.examples.f1;

import java.util.Arrays;

//import com.in28minutes.learnspringframework.game.MarioGame;
//import com.in28minutes.learnspringframework.game.SuperContraGame;
//import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Component
class SomeClass {
	
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("all dependencies ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	
}

@Component
class SomeDependency {
	
	public void getReady() {
		System.out.println("Some Logic using SomeDependency");
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("cleanup");
	}
	
}

@Configuration
@ComponentScan
public class SPrePostAnnotationLauncher {
	
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(SPrePostAnnotationLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
		}

	}

}


