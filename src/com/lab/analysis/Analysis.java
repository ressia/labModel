package com.lab.analysis;

import com.measureModel.units.UnitBehavior;

public class Analysis {
	
	private String name;
	
	private String description;
	
	private NormalValues normalValues;


	public Analysis(String name, String description, NormalValues normalValues) {
		this.name = name;
		this.description = description;
		this.normalValues = normalValues;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public NormalValues getNormalValues() {
		return normalValues;
	}
	
}
