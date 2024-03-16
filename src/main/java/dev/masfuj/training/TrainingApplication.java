package dev.masfuj.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
		System.out.println("This is Rustem");
		System.out.println(rowByIldus());
	}

	public static String rowByIldus(){
		return "Строка 1";
	}

}
