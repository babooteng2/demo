package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.example.app.Frontend;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class App {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = SpringApplication.run(App.class, args)) {
			//Scanner scanner  = new Scanner(System.in);
			//System.out.println("Enter 2 numbers like 'a b' : ");
			/*int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			Calculator calculator = context.getBean(Calculator.class);
			int result = calculator.calc(a, b);*/
			/*ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
			Argument argument =argumentResolver.resolve(System.in);
			Calculator calculator = context.getBean(Calculator.class);			
			int result = calculator.calc(argument.getA(), argument.getB());
			System.out.println("result = " + result);			*/
			Frontend frontend = context.getBean(Frontend.class);
			frontend.run();
		}
	}
}
