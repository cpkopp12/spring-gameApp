package com.in28minutes.learnspringframework;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GHelloWorldSpring {

	public static void main(String[] args) {
		
		var context =
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Params"));
		//System.out.println(context.getBean(Address.class));
	
	}
	

}
