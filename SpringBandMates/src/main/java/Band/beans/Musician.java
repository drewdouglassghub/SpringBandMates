package Band.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Musician {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String instrument;
	private int yearsPlayed;
	@Autowired
	private Contact contactInfo;

	public Musician() {
		super();
	}


	public Musician(int id, String firstName, String lastName, String instrument, int yearsPlayed) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.instrument = instrument;
		this.yearsPlayed = yearsPlayed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public int getYearsPlayed() {
		return yearsPlayed;
	}

	public void setYearsPlayed(int yearsPlayed) {
		this.yearsPlayed = yearsPlayed;
	}
	
	public Contact getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}


	@Override
	public String toString() {
		return "Musician [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", instrument="
				+ instrument + ", yearsPlayed=" + yearsPlayed + ", contactInfo=" + contactInfo + "]";
	}

}
