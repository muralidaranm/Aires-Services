package com.aires.view.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.aires.db.model.Projects;

public class LabsViewModel {

	private int labId;
	private String labName;
	private String labEmail;
	private Date createdOn;
	private Set<LabReportRecipientsViewModel> labReportRecipients = new HashSet<LabReportRecipientsViewModel>(
			0);
	private Set<Projects> projects = new HashSet<Projects>(0);

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabEmail() {
		return labEmail;
	}

	public void setLabEmail(String labEmail) {
		this.labEmail = labEmail;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Set<LabReportRecipientsViewModel> getLabReportRecipientses() {
		return labReportRecipients;
	}

	public void setLabReportRecipientses(
			Set<LabReportRecipientsViewModel> labReportRecipientses) {
		this.labReportRecipients = labReportRecipientses;
	}

	public Set<Projects> getProjectses() {
		return projects;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projects = projectses;
	}
}
