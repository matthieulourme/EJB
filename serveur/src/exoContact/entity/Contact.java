package exoContact.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
/*@NamedNativeQuery(name="Contact.FindContact", 
query="SELECT id, firstName, lastName, email, FROM contact WHERE firstName LIKE ? OR lastName LIKE ? OR email LIKE ? OR adress LIKE ?", 
resultClass=Contact.class)*/
@Table(name="Contacts")
public class Contact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3586181024269191105L;
	

	private String firstName;
	private String lastName;
	private String email;
	@Id@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long  id;
	
	@OneToOne(cascade=CascadeType.PERSIST,orphanRemoval=true)
	@JoinColumn(name="id_address")
	private Adress address;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="contact")
	Set<PhoneNumber> phones = new HashSet<PhoneNumber>();
	
	@ManyToMany(cascade=CascadeType.MERGE)
	@JoinTable(name="CTC_GRP",
	joinColumns=@JoinColumn(name="CTC_ID"),
	inverseJoinColumns=@JoinColumn(name="GRP_ID"))
	private Set<ContactGroup> contactGroups=new HashSet<>();
	
	public Contact(){
	}

	public Contact(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstname){
		this.firstName = firstname;
	}
	
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastname){
		this.lastName = lastname;
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	public Set<PhoneNumber> getPhones() {
		return phones;
	}

	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}

	public Set<ContactGroup> getContactGroups() {
		return contactGroups;
	}

	public void setContactGroups(Set<ContactGroup> contactGroups) {
		this.contactGroups = contactGroups;
	}
	
}
