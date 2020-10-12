package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobApplication.class, args);
	}
	@Bean
	ApplicationRunner init (JobRepository repository) {
		return args ->{
			repository.save(new Job("aaaa",true));
			repository.save(new Job("bbbbb",false));
			repository.findAll().forEach(System.out::println);
		};
	}

}
