package exoContact.entity;

import java.io.Serializable;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Adress")
public class Adress implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8126071688957492409L;
	@Id@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String street;
	private String city;
	private String zip;
	private String country;
	
	
	
	public Adress() {
		// TODO Auto-generated constructor stub
	}
	
	public Adress(String street, String city, String zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}

	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public Integer getId() {
		return id;
	}
	public String getStreet() {
		return street;
	}
	public String getZip() {
		return zip;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
