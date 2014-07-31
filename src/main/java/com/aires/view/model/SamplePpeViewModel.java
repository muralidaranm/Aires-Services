package com.aires.view.model;


public class SamplePpeViewModel {

	private int samplePpeid;
	private String ppe;
	private String samples;
	private Boolean deleted;

	public int getSamplePpeid() {
		return samplePpeid;
	}

	public void setSamplePpeid(int samplePpeid) {
		this.samplePpeid = samplePpeid;
	}

	public String getPpe() {
		return ppe;
	}

	public void setPpe(String ppe) {
		this.ppe = ppe;
	}

	public String getSamples() {
		return samples;
	}

	public void setSamples(String samples) {
		this.samples = samples;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}
