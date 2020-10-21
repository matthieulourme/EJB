package exoContact.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="PhoneNumber")
public class PhoneNumber implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7913929241875208956L;

	private String phoneKind;
	private String phoneNumber;
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="id_contact")
	private Contact contact=null;
	
	public PhoneNumber(String phoneKind, String phoneNumber) {
		super();
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber() {
		super();
	}

	public String getPhoneKind() {
		return phoneKind;
	}

	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
}