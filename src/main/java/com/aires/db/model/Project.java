package com.aires.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ProjectId")
	private int projectId;
	
	@Column(name="ClientId")
	private int clientId;
	
	@Column(name="ContactId")
	private int contactId;
	
	@Column(name="ProjectNumber")
	private String projectNumber;
	
	@Column(name="ProjectDescription")
	private String projectDescription;
	
	@Column(name="DateOnsite")
	@Type(type="timestamp")
	private Date dateOnsite; 
	
	@Column(name="LocationAddress")
	private String locationAddress;
	
	@Column(name="LocationAddress2")
	private String locationAddress2;
	
	@Column(name="LocationCity")
	private String locationCity;
	
	@Column(name="LocationState")
	private String locationState;
	
	@Column(name="LocationPostalCode")
	private String locationPostalCode;
	
	@Column(name="ConsultantId")
	private int consultantId;
	
	@Column(name="LabId")
	private int labId;
	
	@Column(name="QCPerson")
	private String qcPerson;
	
	@Column(name="TurnaroundTimeId")
	private int turnaroundTimeId;
	
	@Column(name="CompletedFlag")
	private boolean completedFlag;
	
	@Column(name="CreatedOn")
	@Type(type="timestamp")
	private Date createdOn;
	
	@Column(name="CreatedBy")
	private String createdBy;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
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

	public int getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(int consultantId) {
		this.consultantId = consultantId;
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public String getQcPerson() {
		return qcPerson;
	}

	public void setQcPerson(String qcPerson) {
		this.qcPerson = qcPerson;
	}

	public int getTurnaroundTimeId() {
		return turnaroundTimeId;
	}

	public void setTurnaroundTimeId(int turnaroundTimeId) {
		this.turnaroundTimeId = turnaroundTimeId;
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
	
	
	
	
	
}
