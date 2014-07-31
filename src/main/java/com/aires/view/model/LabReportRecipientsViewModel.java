package com.aires.view.model;


public class LabReportRecipientsViewModel {
	private int labReportRecipientId;
	private int labId;
	private String firstName;
	private String lastName;
	private String email;

	public int getLabReportRecipientId() {
		return labReportRecipientId;
	}

	public void setLabReportRecipientId(int labReportRecipientId) {
		this.labReportRecipientId = labReportRecipientId;
	}

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
