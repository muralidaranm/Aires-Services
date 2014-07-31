package com.aires.view.model;


public class ResultsViewModel {
	private int resultsId;
	private int sampleId;
	private int sampleChemicalId;
	private String concentration;

	public int getResultsId() {
		return resultsId;
	}

	public void setResultsId(int resultsId) {
		this.resultsId = resultsId;
	}

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public int getSampleChemicalId() {
		return sampleChemicalId;
	}

	public void setSampleChemicalId(int sampleChemicalId) {
		this.sampleChemicalId = sampleChemicalId;
	}

	public String getConcentration() {
		return concentration;
	}

	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}
}
