package com.in28minutes.learnspringframework.helloworld;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GHelloWorldSpring {

	public static void main(String[] args) {
		
		try(var context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Params"));
			System.out.println(context.getBean("person4Params"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean("person5Qualifier"));
//			Arrays.stream(context.getBeanDefinitionNames())
//				.forEach(System.out::println);
		}
		

		
	
	}
	

}
