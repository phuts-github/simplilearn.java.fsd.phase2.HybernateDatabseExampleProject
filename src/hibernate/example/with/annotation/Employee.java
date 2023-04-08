package hibernate.example.with.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name="FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;
  
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

	 @Override
	  public String toString () {

	    return "Employee{" +
	        "id=" + id +
	        ", firstName='" + firstName + '\'' +
	        ", lastName='" + lastName + '\'' +
	        '}';
	  }
}
