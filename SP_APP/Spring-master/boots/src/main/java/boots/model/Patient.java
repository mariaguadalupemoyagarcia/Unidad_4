package boots.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="patients")
public class Patient implements Serializable{
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column (length=45)
	private String first_name;
	@Column (length=50)
	private String last_name; 
	@Column (length=50)
	private String email;
	@Column (length=50)
	private String turn;
	
	
	
	public Patient(String name, String first_name, String last_name, String email, String turn) {
		super();
		this.name = name;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.turn = turn;
	}

	public Patient() {
		this("","","","","");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTurn() {
		return turn;
	}



	public void setTurn(String turn) {
		this.turn = turn;
	}



	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", turn=" + turn + "]";
	}


	


}
