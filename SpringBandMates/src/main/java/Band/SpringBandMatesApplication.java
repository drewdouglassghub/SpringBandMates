package Band;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Band.beans.Contact;
import Band.beans.Musician;
import Band.repository.MusicianRepository;
import controller.BeanConfiguration;


@SpringBootApplication
public class SpringBandMatesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBandMatesApplication.class, args);
	}
	
	@Autowired
	MusicianRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Musician m = appContext.getBean("musician", Musician.class);	
		m.setFirstName("Sam");
		m.setLastName("Batterson");
		m.setInstrument("Drums");
		m.setYearsPlayed(36);
		Contact c = new Contact("555-555-5555", "ted@email.com");
		m.setContactInfo(c);		
		repo.save(m);
		List<Musician> allMusicians = repo.findAll();
		for(Musician people: allMusicians) {
			System.out.println(people.toString());
		}
	
		((AnnotationConfigApplicationContext) appContext).close();
	}
}