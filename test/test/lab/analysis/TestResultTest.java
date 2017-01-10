package test.lab.analysis;

import java.util.Date;

import org.junit.Test;

import com.lab.analysis.Analysis;
import com.lab.analysis.NormalValues;
import com.lab.analysis.TestResult;
import com.measureModel.measurements.Measure;
import com.measureModel.units.BaseUnit;
import com.measureModel.units.UnitBehavior;

import junit.framework.TestCase;

public class TestResultTest extends TestCase {
	
	@Test
	public void testCreation() {
		UnitBehavior unit = new BaseUnit("2");
		Analysis anAnalysis = new Analysis("1","desc",new NormalValues(null,null));
		Date aDate = new Date();
		
		Measure aMeasure = new Measure(1, unit);
		TestResult aTestResult = new TestResult(aDate, aMeasure, anAnalysis);
		
		
		assertEquals(aDate, aTestResult.getDate());
		assertEquals(aMeasure, aTestResult.getMeasure());
		assertEquals(anAnalysis, aTestResult.getAnalysis());
	}

}
