package com.aires.model;

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
 * TurnaroundTimes generated by hbm2java
 */
@Entity
@Table(name = "TurnaroundTimes", schema = "dbo", catalog = "MOBILE_AirQuality")
public class TurnaroundTimes implements java.io.Serializable {

	private int turnaroundTimeId;
	private String turnaroundTime;
	private Set<Projects> projectses = new HashSet<Projects>(0);

	public TurnaroundTimes() {
	}

	public TurnaroundTimes(int turnaroundTimeId, String turnaroundTime) {
		this.turnaroundTimeId = turnaroundTimeId;
		this.turnaroundTime = turnaroundTime;
	}

	public TurnaroundTimes(int turnaroundTimeId, String turnaroundTime,
			Set<Projects> projectses) {
		this.turnaroundTimeId = turnaroundTimeId;
		this.turnaroundTime = turnaroundTime;
		this.projectses = projectses;
	}

	@Id
	@Column(name = "TurnaroundTimeId", unique = true, nullable = false)
	public int getTurnaroundTimeId() {
		return this.turnaroundTimeId;
	}

	public void setTurnaroundTimeId(int turnaroundTimeId) {
		this.turnaroundTimeId = turnaroundTimeId;
	}

	@Column(name = "TurnaroundTime", nullable = false, length = 50)
	public String getTurnaroundTime() {
		return this.turnaroundTime;
	}

	public void setTurnaroundTime(String turnaroundTime) {
		this.turnaroundTime = turnaroundTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "turnaroundTimes")
	public Set<Projects> getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projectses = projectses;
	}

}
