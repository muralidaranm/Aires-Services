package com.aires.view.model;

import java.util.Date;

public class ClientsViewModel {

	private int clientId;
	private String clientName;
	private String clientCity;
	private String clientState;
	private Date createdOn;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientCity() {
		return clientCity;
	}
	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}
	public String getClientState() {
		return clientState;
	}
	public void setClientState(String clientState) {
		this.clientState = clientState;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
}
