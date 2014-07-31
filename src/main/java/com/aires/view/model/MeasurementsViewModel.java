package com.aires.view.model;

import java.util.Date;

public class MeasurementsViewModel {

	private int measurementId;
	private int samplesId;
	private Date onTime;
	private Date offTime;
	private Double onFlowRate;
	private Double offFlowRate;
	private Integer area;
	private Integer minutes;
	private Double volume;
	private Boolean deleted;

	public int getMeasurementId() {
		return measurementId;
	}

	public void setMeasurementId(int measurementId) {
		this.measurementId = measurementId;
	}

	public int getSamplesId() {
		return samplesId;
	}

	public void setSamplesId(int samplesId) {
		this.samplesId = samplesId;
	}

	public Date getOnTime() {
		return onTime;
	}

	public void setOnTime(Date onTime) {
		this.onTime = onTime;
	}

	public Date getOffTime() {
		return offTime;
	}

	public void setOffTime(Date offTime) {
		this.offTime = offTime;
	}

	public Double getOnFlowRate() {
		return onFlowRate;
	}

	public void setOnFlowRate(Double onFlowRate) {
		this.onFlowRate = onFlowRate;
	}

	public Double getOffFlowRate() {
		return offFlowRate;
	}

	public void setOffFlowRate(Double offFlowRate) {
		this.offFlowRate = offFlowRate;
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

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

}
