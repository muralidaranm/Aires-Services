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
 * Chemicals generated by hbm2java
 */
@Entity
@Table(name = "Chemicals", schema = "dbo", catalog = "MOBILE_AirQuality")
public class Chemicals implements java.io.Serializable {

	private int chemicalId;
	private Units units;
	private String chemicalName;
	private String peltwa;
	private String pelstel;
	private String pelc;
	private String tlvtwa;
	private String tlvstel;
	private String tlvc;
	private Set<SampleChemicals> sampleChemicalses = new HashSet<SampleChemicals>(
			0);

	public Chemicals() {
	}

	public Chemicals(int chemicalId, String chemicalName) {
		this.chemicalId = chemicalId;
		this.chemicalName = chemicalName;
	}

	public Chemicals(int chemicalId, Units units, String chemicalName,
			String peltwa, String pelstel, String pelc, String tlvtwa,
			String tlvstel, String tlvc, Set<SampleChemicals> sampleChemicalses) {
		this.chemicalId = chemicalId;
		this.units = units;
		this.chemicalName = chemicalName;
		this.peltwa = peltwa;
		this.pelstel = pelstel;
		this.pelc = pelc;
		this.tlvtwa = tlvtwa;
		this.tlvstel = tlvstel;
		this.tlvc = tlvc;
		this.sampleChemicalses = sampleChemicalses;
	}

	@Id
	@Column(name = "ChemicalId", unique = true, nullable = false)
	public int getChemicalId() {
		return this.chemicalId;
	}

	public void setChemicalId(int chemicalId) {
		this.chemicalId = chemicalId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UnitId")
	public Units getUnits() {
		return this.units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	@Column(name = "ChemicalName", nullable = false, length = 50)
	public String getChemicalName() {
		return this.chemicalName;
	}

	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}

	@Column(name = "PELTWA", length = 10)
	public String getPeltwa() {
		return this.peltwa;
	}

	public void setPeltwa(String peltwa) {
		this.peltwa = peltwa;
	}

	@Column(name = "PELSTEL", length = 10)
	public String getPelstel() {
		return this.pelstel;
	}

	public void setPelstel(String pelstel) {
		this.pelstel = pelstel;
	}

	@Column(name = "PELC", length = 10)
	public String getPelc() {
		return this.pelc;
	}

	public void setPelc(String pelc) {
		this.pelc = pelc;
	}

	@Column(name = "TLVTWA", length = 10)
	public String getTlvtwa() {
		return this.tlvtwa;
	}

	public void setTlvtwa(String tlvtwa) {
		this.tlvtwa = tlvtwa;
	}

	@Column(name = "TLVSTEL", length = 10)
	public String getTlvstel() {
		return this.tlvstel;
	}

	public void setTlvstel(String tlvstel) {
		this.tlvstel = tlvstel;
	}

	@Column(name = "TLVC", length = 10)
	public String getTlvc() {
		return this.tlvc;
	}

	public void setTlvc(String tlvc) {
		this.tlvc = tlvc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chemicals")
	public Set<SampleChemicals> getSampleChemicalses() {
		return this.sampleChemicalses;
	}

	public void setSampleChemicalses(Set<SampleChemicals> sampleChemicalses) {
		this.sampleChemicalses = sampleChemicalses;
	}

}
