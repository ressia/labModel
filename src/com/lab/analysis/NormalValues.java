package com.lab.analysis;

import com.measureModel.measurements.Measure;

/**
 * This class models the specification and validation of normal values for any kind of analysis
 * In the future there will be different normal values calculator, for people, for systems, for groups of 
 * people, null validators for those who have no normal values
 * We could have average in the future;
 * Maybe in the future we need to decouple specification from validation, we will see.
 * 
 * We should have complex (composite) for people, man, women and children, different limits, sex and age will define their use
 * 
 * @author ressia
 *
 */
public class NormalValues {
	
	private Measure min;
	private Measure max;

	public NormalValues(Measure aMin, Measure aMax) {
		this.min = aMin;
		this.max = aMax;
	}

	public Measure getMin() {
		return min;
	}

	public Measure getMax() {
		return max;
	}

	public boolean isValidFor(Measure aMeasure) {
		return aMeasure.between(min, max);
	}

}
