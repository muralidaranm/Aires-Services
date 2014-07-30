package com.aires.model;

// Generated Jul 23, 2014 1:40:15 PM by Hibernate Tools 3.4.0.CR1

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

/**
 * SampleChemicals generated by hbm2java
 */
@Entity
@Table(name = "SampleChemicals", schema = "dbo", catalog = "MOBILE_AirQuality")
public class SampleChemicals implements java.io.Serializable {

	private int sampleChemicalId;
	private Samples samples;
	private Chemicals chemicals;
	private Boolean peltwaflag;
	private Boolean pelstelflag;
	private Boolean pelcflag;
	private Boolean tlvtwaflag;
	private Boolean tlvstelflag;
	private Boolean tlvcflag;
	private Boolean deleted;
	private Set<Results> resultses = new HashSet<Results>(0);

	public SampleChemicals() {
	}

	public SampleChemicals(int sampleChemicalId, Samples samples,
			Chemicals chemicals) {
		this.sampleChemicalId = sampleChemicalId;
		this.samples = samples;
		this.chemicals = chemicals;
	}

	public SampleChemicals(int sampleChemicalId, Samples samples,
			Chemicals chemicals, Boolean peltwaflag, Boolean pelstelflag,
			Boolean pelcflag, Boolean tlvtwaflag, Boolean tlvstelflag,
			Boolean tlvcflag, Boolean deleted, Set<Results> resultses) {
		this.sampleChemicalId = sampleChemicalId;
		this.samples = samples;
		this.chemicals = chemicals;
		this.peltwaflag = peltwaflag;
		this.pelstelflag = pelstelflag;
		this.pelcflag = pelcflag;
		this.tlvtwaflag = tlvtwaflag;
		this.tlvstelflag = tlvstelflag;
		this.tlvcflag = tlvcflag;
		this.deleted = deleted;
		this.resultses = resultses;
	}

	@Id
	@Column(name = "SampleChemicalId", unique = true, nullable = false)
	public int getSampleChemicalId() {
		return this.sampleChemicalId;
	}

	public void setSampleChemicalId(int sampleChemicalId) {
		this.sampleChemicalId = sampleChemicalId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SampleId", nullable = false)
	public Samples getSamples() {
		return this.samples;
	}

	public void setSamples(Samples samples) {
		this.samples = samples;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ChemicalId", nullable = false)
	public Chemicals getChemicals() {
		return this.chemicals;
	}

	public void setChemicals(Chemicals chemicals) {
		this.chemicals = chemicals;
	}

	@Column(name = "PELTWAFlag")
	public Boolean getPeltwaflag() {
		return this.peltwaflag;
	}

	public void setPeltwaflag(Boolean peltwaflag) {
		this.peltwaflag = peltwaflag;
	}

	@Column(name = "PELSTELFlag")
	public Boolean getPelstelflag() {
		return this.pelstelflag;
	}

	public void setPelstelflag(Boolean pelstelflag) {
		this.pelstelflag = pelstelflag;
	}

	@Column(name = "PELCFlag")
	public Boolean getPelcflag() {
		return this.pelcflag;
	}

	public void setPelcflag(Boolean pelcflag) {
		this.pelcflag = pelcflag;
	}

	@Column(name = "TLVTWAFlag")
	public Boolean getTlvtwaflag() {
		return this.tlvtwaflag;
	}

	public void setTlvtwaflag(Boolean tlvtwaflag) {
		this.tlvtwaflag = tlvtwaflag;
	}

	@Column(name = "TLVSTELFlag")
	public Boolean getTlvstelflag() {
		return this.tlvstelflag;
	}

	public void setTlvstelflag(Boolean tlvstelflag) {
		this.tlvstelflag = tlvstelflag;
	}

	@Column(name = "TLVCFlag")
	public Boolean getTlvcflag() {
		return this.tlvcflag;
	}

	public void setTlvcflag(Boolean tlvcflag) {
		this.tlvcflag = tlvcflag;
	}

	@Column(name = "Deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sampleChemicals")
	public Set<Results> getResultses() {
		return this.resultses;
	}

	public void setResultses(Set<Results> resultses) {
		this.resultses = resultses;
	}

}
