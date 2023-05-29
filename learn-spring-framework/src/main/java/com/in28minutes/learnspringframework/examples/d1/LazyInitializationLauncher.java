package com.in28minutes.learnspringframework.examples.d1;

import java.util.Arrays;

//import com.in28minutes.learnspringframework.game.MarioGame;
//import com.in28minutes.learnspringframework.game.SuperContraGame;
//import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("did something");
	}
	
}


@Configuration
@ComponentScan
public class LazyInitializationLauncher {
	
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println("context initialization completed");
			context.getBean(ClassB.class).doSomething();
		}

	}

}


