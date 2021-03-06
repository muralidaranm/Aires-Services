package com.aires.db.model;

// Generated Jul 23, 2014 1:40:15 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contacts generated by hbm2java
 */
@Entity
@Table(name = "Contacts", schema = "dbo", catalog = "MOBILE_AirQuality")
public class Contacts implements java.io.Serializable {

	private int contactId;
	private Clients clients;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String mobileNumber;
	private String email;
	private Date createdOn;
	private Set<Projects> projectses = new HashSet<Projects>(0);

	public Contacts() {
	}

	public Contacts(int contactId, Clients clients, String firstName,
			String lastName, String phoneNumber, Date createdOn) {
		this.contactId = contactId;
		this.clients = clients;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.createdOn = createdOn;
	}

	public Contacts(int contactId, Clients clients, String firstName,
			String lastName, String phoneNumber, String mobileNumber,
			String email, Date createdOn, Set<Projects> projectses) {
		this.contactId = contactId;
		this.clients = clients;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.createdOn = createdOn;
		this.projectses = projectses;
	}

	@Id
	@Column(name = "ContactId", unique = true, nullable = false)
	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ClientId", nullable = false)
	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	@Column(name = "FirstName", nullable = false, length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", nullable = false, length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "PhoneNumber", nullable = false, length = 50)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "MobileNumber", length = 50)
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "Email", length = 128)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", nullable = false, length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contacts")
	public Set<Projects> getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projectses = projectses;
	}

}
