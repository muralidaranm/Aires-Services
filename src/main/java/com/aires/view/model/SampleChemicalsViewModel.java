package com.aires.view.model;


public class SampleChemicalsViewModel {
	private int sampleChemicalId;
	private int sampleId;
	private int chemicalId;
	private Boolean peltwaflag;
	private Boolean pelstelflag;
	private Boolean pelcflag;
	private Boolean tlvtwaflag;
	private Boolean tlvstelflag;
	private Boolean tlvcflag;
	private Boolean deleted;

	public int getSampleChemicalId() {
		return sampleChemicalId;
	}

	public void setSampleChemicalId(int sampleChemicalId) {
		this.sampleChemicalId = sampleChemicalId;
	}

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public int getChemicalId() {
		return chemicalId;
	}

	public void setChemicalId(int chemicalId) {
		this.chemicalId = chemicalId;
	}

	public Boolean getPeltwaflag() {
		return peltwaflag;
	}

	public void setPeltwaflag(Boolean peltwaflag) {
		this.peltwaflag = peltwaflag;
	}

	public Boolean getPelstelflag() {
		return pelstelflag;
	}

	public void setPelstelflag(Boolean pelstelflag) {
		this.pelstelflag = pelstelflag;
	}

	public Boolean getPelcflag() {
		return pelcflag;
	}

	public void setPelcflag(Boolean pelcflag) {
		this.pelcflag = pelcflag;
	}

	public Boolean getTlvtwaflag() {
		return tlvtwaflag;
	}

	public void setTlvtwaflag(Boolean tlvtwaflag) {
		this.tlvtwaflag = tlvtwaflag;
	}

	public Boolean getTlvstelflag() {
		return tlvstelflag;
	}

	public void setTlvstelflag(Boolean tlvstelflag) {
		this.tlvstelflag = tlvstelflag;
	}

	public Boolean getTlvcflag() {
		return tlvcflag;
	}

	public void setTlvcflag(Boolean tlvcflag) {
		this.tlvcflag = tlvcflag;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
