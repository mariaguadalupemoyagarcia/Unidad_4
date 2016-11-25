package boots.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity (name="cars")
public class Car implements Serializable {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=50)
	private String name;
	@Column (length=50)
	private String type;
	@Column (length=50)
	private String model;
	@Column (length=50)
	private String color;
	@Column (length=50)
	private String price;


	

	public Car( String name, String type, String model, String color, String price) {
		super();
		
		this.name = name;
		this.type = type;
		this.model = model;
		this.color = color;
		this.price = price;
	}




	public Car(){this("","","","","");}




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




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getPrice() {
		return price;
	}




	public void setPrice(String price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "Pub [id=" + id + ", name=" + name + ", type=" + type + ", model=" + model + ", color="
				+ color + ", price=" + price + "]";
	}

	
	
	
}