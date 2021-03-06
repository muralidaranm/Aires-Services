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
 * Projects generated by hbm2java
 */
@Entity
@Table(name = "Projects", schema = "dbo", catalog = "MOBILE_AirQuality")
public class Projects implements java.io.Serializable {

	private int projectId;
	private Users users;
	private Contacts contacts;
	private Labs labs;
	private Clients clients;
	private TurnaroundTimes turnaroundTimes;
	private String projectNumber;
	private String projectDescription;
	private Date dateOnsite;
	private String locationAddress;
	private String locationAddress2;
	private String locationCity;
	private String locationState;
	private String locationPostalCode;
	private String qcperson;
	private boolean completedFlag;
	private Date createdOn;
	private String createdBy;
	private Set<Samples> sampleses = new HashSet<Samples>(0);
	private Set<UserProjects> userProjectses = new HashSet<UserProjects>(0);

	public Projects() {
	}

	public Projects(int projectId, Users users, Contacts contacts, Labs labs,
			Clients clients, TurnaroundTimes turnaroundTimes,
			String projectNumber, String projectDescription, Date dateOnsite,
			String locationAddress, String locationCity, String locationState,
			String locationPostalCode, String qcperson, boolean completedFlag,
			Date createdOn) {
		this.projectId = projectId;
		this.users = users;
		this.contacts = contacts;
		this.labs = labs;
		this.clients = clients;
		this.turnaroundTimes = turnaroundTimes;
		this.projectNumber = projectNumber;
		this.projectDescription = projectDescription;
		this.dateOnsite = dateOnsite;
		this.locationAddress = locationAddress;
		this.locationCity = locationCity;
		this.locationState = locationState;
		this.locationPostalCode = locationPostalCode;
		this.qcperson = qcperson;
		this.completedFlag = completedFlag;
		this.createdOn = createdOn;
	}

	public Projects(int projectId, Users users, Contacts contacts, Labs labs,
			Clients clients, TurnaroundTimes turnaroundTimes,
			String projectNumber, String projectDescription, Date dateOnsite,
			String locationAddress, String locationAddress2,
			String locationCity, String locationState,
			String locationPostalCode, String qcperson, boolean completedFlag,
			Date createdOn, String createdBy, Set<Samples> sampleses,
			Set<UserProjects> userProjectses) {
		this.projectId = projectId;
		this.users = users;
		this.contacts = contacts;
		this.labs = labs;
		this.clients = clients;
		this.turnaroundTimes = turnaroundTimes;
		this.projectNumber = projectNumber;
		this.projectDescription = projectDescription;
		this.dateOnsite = dateOnsite;
		this.locationAddress = locationAddress;
		this.locationAddress2 = locationAddress2;
		this.locationCity = locationCity;
		this.locationState = locationState;
		this.locationPostalCode = locationPostalCode;
		this.qcperson = qcperson;
		this.completedFlag = completedFlag;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.sampleses = sampleses;
		this.userProjectses = userProjectses;
	}

	@Id
	@Column(name = "ProjectId", unique = true, nullable = false)
	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ConsultantId", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ContactId", nullable = false)
	public Contacts getContacts() {
		return this.contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LabId", nullable = false)
	public Labs getLabs() {
		return this.labs;
	}

	public void setLabs(Labs labs) {
		this.labs = labs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ClientId", nullable = false)
	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TurnaroundTimeId", nullable = false)
	public TurnaroundTimes getTurnaroundTimes() {
		return this.turnaroundTimes;
	}

	public void setTurnaroundTimes(TurnaroundTimes turnaroundTimes) {
		this.turnaroundTimes = turnaroundTimes;
	}

	@Column(name = "ProjectNumber", nullable = false, length = 20)
	public String getProjectNumber() {
		return this.projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	@Column(name = "ProjectDescription", nullable = false, length = 128)
	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateOnsite", nullable = false, length = 23)
	public Date getDateOnsite() {
		return this.dateOnsite;
	}

	public void setDateOnsite(Date dateOnsite) {
		this.dateOnsite = dateOnsite;
	}

	@Column(name = "LocationAddress", nullable = false, length = 150)
	public String getLocationAddress() {
		return this.locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	@Column(name = "LocationAddress2", length = 150)
	public String getLocationAddress2() {
		return this.locationAddress2;
	}

	public void setLocationAddress2(String locationAddress2) {
		this.locationAddress2 = locationAddress2;
	}

	@Column(name = "LocationCity", nullable = false, length = 50)
	public String getLocationCity() {
		return this.locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	@Column(name = "LocationState", nullable = false, length = 50)
	public String getLocationState() {
		return this.locationState;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}

	@Column(name = "LocationPostalCode", nullable = false, length = 15)
	public String getLocationPostalCode() {
		return this.locationPostalCode;
	}

	public void setLocationPostalCode(String locationPostalCode) {
		this.locationPostalCode = locationPostalCode;
	}

	@Column(name = "QCPerson", nullable = false, length = 50)
	public String getQcperson() {
		return this.qcperson;
	}

	public void setQcperson(String qcperson) {
		this.qcperson = qcperson;
	}

	@Column(name = "CompletedFlag", nullable = false)
	public boolean isCompletedFlag() {
		return this.completedFlag;
	}

	public void setCompletedFlag(boolean completedFlag) {
		this.completedFlag = completedFlag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", nullable = false, length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "CreatedBy", length = 150)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<Samples> getSampleses() {
		return this.sampleses;
	}

	public void setSampleses(Set<Samples> sampleses) {
		this.sampleses = sampleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<UserProjects> getUserProjectses() {
		return this.userProjectses;
	}

	public void setUserProjectses(Set<UserProjects> userProjectses) {
		this.userProjectses = userProjectses;
	}

}
