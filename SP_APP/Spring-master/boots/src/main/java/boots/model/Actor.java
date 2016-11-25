package boots.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="actor")
public class Actor implements Serializable{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=45)
	private String name;
	@Column(length=45)
	private String age;
	@Temporal(TemporalType.DATE)
	@Column(name="date_start")
	private Date dateStart;
	private boolean state;
	public Actor(String name, String age, Date dateStart, boolean state) {
		super();
		this.name = name;
		this.age = age;
		this.dateStart = dateStart;
		this.state = state;
	}
	
	public Actor() {
		this("","",new Date(),false);
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Actors [id=" + id + ", name=" + name + ", age=" + age + ", dateStart=" + dateStart
				+ ", state=" + state + "]";
	}
	
	
	
}
