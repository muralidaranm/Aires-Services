package com.aires.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Chemicals")
public class Chemical implements Serializable{

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeltwa() {
		return peltwa;
	}

	public void setPeltwa(String peltwa) {
		this.peltwa = peltwa;
	}

	public String getPelstel() {
		return pelstel;
	}

	public void setPelstel(String pelstel) {
		this.pelstel = pelstel;
	}

	public String getPelc() {
		return pelc;
	}

	public void setPelc(String pelc) {
		this.pelc = pelc;
	}

	public String getTlvtwa() {
		return tlvtwa;
	}

	public void setTlvtwa(String tlvtwa) {
		this.tlvtwa = tlvtwa;
	}

	public String getTlvstel() {
		return tlvstel;
	}

	public void setTlvstel(String tlvstel) {
		this.tlvstel = tlvstel;
	}

	public String getTlvc() {
		return tlvc;
	}

	public void setTlvc(String tlvc) {
		this.tlvc = tlvc;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ChemicalId")
	private int id;
	
	@Column(name="ChemicalName")
	private String name;
	
	@Column(name="PELTWA")
	private String peltwa;
	
	@Column(name="PELSTEL")
	private String pelstel;
	
	@Column(name="PELC")
	private String pelc;
	
	@Column(name="TLVTWA")
	private String tlvtwa;
	
	@Column(name="TLVSTEL")
	private String tlvstel;
	
	@Column(name="TLVC")
	private String tlvc;
	
	@Column(name="UnitId")
	private String unitId;
	
}
