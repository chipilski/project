package com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}


	public class TollProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... strings) throws Exception {
			System.out.println("entered run method !!!");
			System.out.println(strings);
		}
	}
}



