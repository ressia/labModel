package test.lab.analysis;

import org.junit.Test;

import com.lab.analysis.NormalValues;
import com.measureModel.measurements.Measure;
import com.measureModel.units.BaseUnit;
import com.measureModel.units.UnitBehavior;

import junit.framework.TestCase;
import test.measureModel.units.resources.UnitsTestResource;

public class NormalValuesTest extends TestCase {
	
	@Test
	public void testCreation() {
		UnitBehavior unit = new BaseUnit("2");
		Measure min = new Measure(1, unit);
		Measure max = new Measure(3, unit);
		
		NormalValues aNormalValues = new NormalValues(min, max);
		
		assertEquals(min, aNormalValues.getMin());
		assertEquals(max, aNormalValues.getMax());
	}
	
	@Test
	public void testValidationValid() {
		UnitsTestResource units = UnitsTestResource.newInstance();
		Measure min = new Measure(1, units.meter());
		Measure max = new Measure(3, units.meter());
		
		NormalValues aNormalValues = new NormalValues(min, max);
		Measure aMessage = new Measure(2, units.meter());
		assertTrue(aNormalValues.isValidFor(aMessage));
		aMessage = new Measure(1, units.meter());
		assertTrue(aNormalValues.isValidFor(aMessage));
		aMessage = new Measure(3, units.meter());
		assertTrue(aNormalValues.isValidFor(aMessage));
	}
	
	@Test
	public void testValidationInvalid() {
		UnitsTestResource units = UnitsTestResource.newInstance();
		Measure min = new Measure(1, units.meter());
		Measure max = new Measure(3, units.meter());
		
		NormalValues aNormalValues = new NormalValues(min, max);
		Measure aMessage = new Measure(0, units.meter());
		assertFalse(aNormalValues.isValidFor(aMessage));
		aMessage = new Measure(4, units.meter());
		assertFalse(aNormalValues.isValidFor(aMessage));
		aMessage = new Measure(5, units.meter());
		assertFalse(aNormalValues.isValidFor(aMessage));
	}

}
