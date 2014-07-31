package com.aires.view.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.aires.db.model.SamplePpe;

public class SamplesViewModel {

	private int sampleId;
	private String sampleTypes;
	private String deviceTypes;
	private int projectId;
	private String sampleNumber;
	private int ppeid;
	private String comments;
	private String notes;
	private Integer area;
	private Integer minutes;
	private Double volume;
	private String employeeName;
	private String employeeJob;
	private String operationArea;
	private Date createdOn;
	private Set<SampleChemicalsViewModel> sampleChemicals = new HashSet<SampleChemicalsViewModel>(
			0);
	private Set<ResultsViewModel> results = new HashSet<ResultsViewModel>(0);
	private Set<MeasurementsViewModel> measurements = new HashSet<MeasurementsViewModel>(
			0);
	private Set<SamplePpeViewModel> samplePpes = new HashSet<SamplePpeViewModel>(0);

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleTypes() {
		return sampleTypes;
	}

	public void setSampleTypes(String sampleTypes) {
		this.sampleTypes = sampleTypes;
	}

	public String getDeviceTypes() {
		return deviceTypes;
	}

	public void setDeviceTypes(String deviceTypes) {
		this.deviceTypes = deviceTypes;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getSampleNumber() {
		return sampleNumber;
	}

	public void setSampleNumber(String sampleNumber) {
		this.sampleNumber = sampleNumber;
	}

	public int getPpeid() {
		return ppeid;
	}

	public void setPpeid(int ppeid) {
		this.ppeid = ppeid;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeJob() {
		return employeeJob;
	}

	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}

	public String getOperationArea() {
		return operationArea;
	}

	public void setOperationArea(String operationArea) {
		this.operationArea = operationArea;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Set<SampleChemicalsViewModel> getSampleChemicals() {
		return sampleChemicals;
	}

	public void setSampleChemicals(Set<SampleChemicalsViewModel> sampleChemicals) {
		this.sampleChemicals = sampleChemicals;
	}

	public Set<ResultsViewModel> getResults() {
		return results;
	}

	public void setResults(Set<ResultsViewModel> results) {
		this.results = results;
	}

	public Set<MeasurementsViewModel> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(Set<MeasurementsViewModel> measurements) {
		this.measurements = measurements;
	}

	public Set<SamplePpeViewModel> getSamplePpes() {
		return samplePpes;
	}

	public void setSamplePpes(Set<SamplePpeViewModel> samplePpes) {
		this.samplePpes = samplePpes;
	}
}
