package com.cenfotec.mongobasico;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cenfotec.mongobasico.domain.Journal;
import com.cenfotec.mongobasico.service.JournalService;

@SpringBootApplication
public class MongoBasicoApplication {
	private static final Logger log = LoggerFactory.getLogger(MongoBasicoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MongoBasicoApplication.class, args);
	}

	@Bean
	CommandLineRunner start(JournalService service) {
		return args -> {
			log.info("> Deleting existing data...");
			service.deleteAllJournals();
			log.info("> Inserting new data...");
			service.saveJournal(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "01/02/2016"));
			service.saveJournal(
					new Journal("Simple Spring Boot Project", "I will do my first Spring Boot Project", "01/03/2016"));
			service.saveJournal(new Journal("Spring Boot Reading", "Read more about Spring Boot", "02/02/2016"));
			service.saveJournal(
					new Journal("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", "03/01/2016"));
			log.info("> Getting all data...");
			service.getAllJournals().forEach(entry -> log.info(entry.toString()));
			log.info("> Getting data using like...");
			service.findJournalsByTitle("Cloud").forEach(entry -> log.info(entry.toString()));
		};
	}
}
