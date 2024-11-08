package eu.school.demospring;

import eu.school.demospring.entities.Personne;
import eu.school.demospring.repositories.PersonneRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoSpringApplication.class, args);
//		var repo = context.getBean(PersonneRepository.class);
//		repo.save( new Personne( "John", "Doe" ) );
//		repo.flush();
//		repo.findAll().forEach(System.out::println);
	}

}
