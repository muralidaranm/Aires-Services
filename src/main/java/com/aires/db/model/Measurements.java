package com.aires.db.model;

// Generated Jul 23, 2014 1:40:15 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Measurements generated by hbm2java
 */
@Entity
@Table(name = "Measurements", schema = "dbo", catalog = "MOBILE_AirQuality")
public class Measurements implements java.io.Serializable {

	private int measurementId;
	private Samples samples;
	private Date onTime;
	private Date offTime;
	private Double onFlowRate;
	private Double offFlowRate;
	private Integer area;
	private Integer minutes;
	private Double volume;
	private Boolean deleted;

	public Measurements() {
	}

	public Measurements(int measurementId, Samples samples) {
		this.measurementId = measurementId;
		this.samples = samples;
	}

	public Measurements(int measurementId, Samples samples, Date onTime,
			Date offTime, Double onFlowRate, Double offFlowRate, Integer area,
			Integer minutes, Double volume, Boolean deleted) {
		this.measurementId = measurementId;
		this.samples = samples;
		this.onTime = onTime;
		this.offTime = offTime;
		this.onFlowRate = onFlowRate;
		this.offFlowRate = offFlowRate;
		this.area = area;
		this.minutes = minutes;
		this.volume = volume;
		this.deleted = deleted;
	}

	@Id
	@Column(name = "MeasurementId", unique = true, nullable = false)
	public int getMeasurementId() {
		return this.measurementId;
	}

	public void setMeasurementId(int measurementId) {
		this.measurementId = measurementId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SampleId", nullable = false)
	public Samples getSamples() {
		return this.samples;
	}

	public void setSamples(Samples samples) {
		this.samples = samples;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OnTime", length = 23)
	public Date getOnTime() {
		return this.onTime;
	}

	public void setOnTime(Date onTime) {
		this.onTime = onTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OffTime", length = 23)
	public Date getOffTime() {
		return this.offTime;
	}

	public void setOffTime(Date offTime) {
		this.offTime = offTime;
	}

	@Column(name = "OnFlowRate", precision = 53, scale = 0)
	public Double getOnFlowRate() {
		return this.onFlowRate;
	}

	public void setOnFlowRate(Double onFlowRate) {
		this.onFlowRate = onFlowRate;
	}

	@Column(name = "OffFlowRate", precision = 53, scale = 0)
	public Double getOffFlowRate() {
		return this.offFlowRate;
	}

	public void setOffFlowRate(Double offFlowRate) {
		this.offFlowRate = offFlowRate;
	}

	@Column(name = "Area")
	public Integer getArea() {
		return this.area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	@Column(name = "Minutes")
	public Integer getMinutes() {
		return this.minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	@Column(name = "Volume", precision = 53, scale = 0)
	public Double getVolume() {
		return this.volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	@Column(name = "Deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

}
