package com.aires.view.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.aires.db.model.UserProjects;

public class ProjectDetails {

	private int projectId;
	private String consultant;
	private ContactsViewModel contact;
	private LabsViewModel lab;
	private ClientsViewModel clients;
	private String turnaroundTime;
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
	private Set<SamplesViewModel> samples = new HashSet<SamplesViewModel>(0);
	private Set<UserProjects> userProjects = new HashSet<UserProjects>(0);

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getConsultant() {
		return consultant;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}

	public ContactsViewModel getContact() {
		return contact;
	}

	public void setContact(ContactsViewModel contact) {
		this.contact = contact;
	}

	public LabsViewModel getLab() {
		return lab;
	}

	public void setLab(LabsViewModel lab) {
		this.lab = lab;
	}

	public ClientsViewModel getClients() {
		return clients;
	}

	public void setClients(ClientsViewModel clients) {
		this.clients = clients;
	}

	public String getTurnaroundTime() {
		return turnaroundTime;
	}

	public void setTurnaroundTime(String turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Date getDateOnsite() {
		return dateOnsite;
	}

	public void setDateOnsite(Date dateOnsite) {
		this.dateOnsite = dateOnsite;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getLocationAddress2() {
		return locationAddress2;
	}

	public void setLocationAddress2(String locationAddress2) {
		this.locationAddress2 = locationAddress2;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getLocationState() {
		return locationState;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}

	public String getLocationPostalCode() {
		return locationPostalCode;
	}

	public void setLocationPostalCode(String locationPostalCode) {
		this.locationPostalCode = locationPostalCode;
	}

	public String getQcperson() {
		return qcperson;
	}

	public void setQcperson(String qcperson) {
		this.qcperson = qcperson;
	}

	public boolean isCompletedFlag() {
		return completedFlag;
	}

	public void setCompletedFlag(boolean completedFlag) {
		this.completedFlag = completedFlag;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Set<SamplesViewModel> getSampleses() {
		return samples;
	}

	public void setSampleses(Set<SamplesViewModel> sampleses) {
		this.samples = sampleses;
	}

	public Set<UserProjects> getUserProjectses() {
		return userProjects;
	}

	public void setUserProjectses(Set<UserProjects> userProjectses) {
		this.userProjects = userProjectses;
	}

}
