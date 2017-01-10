package test.lab.analysis;

import org.junit.Test;

import com.lab.analysis.Analysis;
import com.lab.analysis.NormalValues;
import com.measureModel.units.BaseUnit;
import com.measureModel.units.UnitBehavior;

import junit.framework.TestCase;

public class AnalysisTest extends TestCase {
	
	@Test
	public void testCreation() {
		NormalValues normalValues = new NormalValues(null,null);
		Analysis analysis = new Analysis("1","2",normalValues);
		assertEquals("1", analysis.getName());
		assertEquals("2", analysis.getDescription());
		assertEquals(normalValues, analysis.getNormalValues());
	}

}
