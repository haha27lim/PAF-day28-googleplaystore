package sg.edu.nus.iss.app.day28googleplaystore;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import sg.edu.nus.iss.app.day28googleplaystore.repository.AppsRepository;

@SpringBootApplication
public class Day28GoogleplaystoreApplication implements CommandLineRunner {

	@Autowired
	private AppsRepository appsRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Day28GoogleplaystoreApplication.class, args);
	}

	@Override
	public void run(String... args) {
		List<Document> results = appsRepo.getApplicationsByCategory();
		for (Document d: results)
			System.out.printf(">> %s\n", d.toJson());
	}
}
