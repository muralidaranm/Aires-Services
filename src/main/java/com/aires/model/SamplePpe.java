package com.aires.model;

// Generated Jul 23, 2014 1:40:15 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SamplePpe generated by hbm2java
 */
@Entity
@Table(name = "SamplePPE", schema = "dbo", catalog = "MOBILE_AirQuality")
public class SamplePpe implements java.io.Serializable {

	private int samplePpeid;
	private Ppe ppe;
	private Samples samples;
	private Boolean deleted;

	public SamplePpe() {
	}

	public SamplePpe(int samplePpeid, Ppe ppe, Samples samples) {
		this.samplePpeid = samplePpeid;
		this.ppe = ppe;
		this.samples = samples;
	}

	public SamplePpe(int samplePpeid, Ppe ppe, Samples samples, Boolean deleted) {
		this.samplePpeid = samplePpeid;
		this.ppe = ppe;
		this.samples = samples;
		this.deleted = deleted;
	}

	@Id
	@Column(name = "SamplePPEId", unique = true, nullable = false)
	public int getSamplePpeid() {
		return this.samplePpeid;
	}

	public void setSamplePpeid(int samplePpeid) {
		this.samplePpeid = samplePpeid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PPEId", nullable = false)
	public Ppe getPpe() {
		return this.ppe;
	}

	public void setPpe(Ppe ppe) {
		this.ppe = ppe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SamplesId", nullable = false)
	public Samples getSamples() {
		return this.samples;
	}

	public void setSamples(Samples samples) {
		this.samples = samples;
	}

	@Column(name = "Deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

}
