package com.lab.analysis;

import java.util.Date;

import com.measureModel.measurements.Measure;

public class TestResult {
	
	private Date date;
	
	private Measure measure;
	
	private Analysis analysis;

	public TestResult(Date aDate, Measure aMeasure, Analysis anAnalysis) {
		this.date = aDate;
		this.measure = aMeasure;
		this.analysis = anAnalysis;
	}

	public Date getDate() {
		return date;
	}

	public Measure getMeasure() {
		return measure;
	}

	public Analysis getAnalysis() {
		return analysis;
	}

}
