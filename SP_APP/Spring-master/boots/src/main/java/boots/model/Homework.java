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


@Entity(name="homeworks")
public class Homework implements Serializable {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=50)
	private String name;
	@Column (length=50)
	private String description;
	@Temporal(TemporalType.DATE)
	@Column (name="date_created")
	private Date dateCreated;
	private boolean finished;
	@Column (length=50)
	private String matter;
	public Homework(){}
	
	public Homework(String name, String description, Date dateCreated, boolean finished,String matter) {
		super();
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreated;
		this.finished = finished;
		this.matter=matter;
	}
	
	/**
	 * @return the matter
	 */
	public String getMatter() {
		return matter;
	}

	/**
	 * @param matter the matter to set
	 */
	public void setMatter(String matter) {
		this.matter = matter;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Homework [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated=" + dateCreated
				+ ", finished=" + finished + ", matter=" + matter + "]";
	}

	
	
	
}
