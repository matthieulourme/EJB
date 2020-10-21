package exoContact.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ContactGroup")
public class ContactGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3287522674110971554L;
	
	@Id@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long groupId;
	private String groupName;
	
	@ManyToMany(mappedBy="contactGroups")
	private Set <Contact> contacts=new HashSet<Contact>();
	
	
	public ContactGroup() {
		super();
	}
	public ContactGroup(String groupName) {
		super();
		this.groupName = groupName;
	}
	
	public ContactGroup(Long groupId, String groupName) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Set<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	
	

}
