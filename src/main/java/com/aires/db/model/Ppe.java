package com.aires.db.model;

// Generated Jul 23, 2014 1:40:15 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ppe generated by hbm2java
 */
@Entity
@Table(name = "PPE", schema = "dbo", catalog = "MOBILE_AirQuality")
public class Ppe implements java.io.Serializable {

	private int ppeid;
	private String protectionEquipmentName;
	private Set<SamplePpe> samplePpes = new HashSet<SamplePpe>(0);

	public Ppe() {
	}

	public Ppe(int ppeid, String protectionEquipmentName) {
		this.ppeid = ppeid;
		this.protectionEquipmentName = protectionEquipmentName;
	}

	public Ppe(int ppeid, String protectionEquipmentName,
			Set<SamplePpe> samplePpes) {
		this.ppeid = ppeid;
		this.protectionEquipmentName = protectionEquipmentName;
		this.samplePpes = samplePpes;
	}

	@Id
	@Column(name = "PPEId", unique = true, nullable = false)
	public int getPpeid() {
		return this.ppeid;
	}

	public void setPpeid(int ppeid) {
		this.ppeid = ppeid;
	}

	@Column(name = "ProtectionEquipmentName", nullable = false, length = 50)
	public String getProtectionEquipmentName() {
		return this.protectionEquipmentName;
	}

	public void setProtectionEquipmentName(String protectionEquipmentName) {
		this.protectionEquipmentName = protectionEquipmentName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ppe")
	public Set<SamplePpe> getSamplePpes() {
		return this.samplePpes;
	}

	public void setSamplePpes(Set<SamplePpe> samplePpes) {
		this.samplePpes = samplePpes;
	}

}
