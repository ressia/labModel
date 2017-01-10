package test.lab.analysis;

import java.util.Date;

import org.junit.Test;

import com.lab.analysis.Analysis;
import com.lab.analysis.NormalValues;
import com.lab.analysis.Patient;
import com.lab.analysis.Protocol;
import com.lab.analysis.TestResult;
import com.measureModel.measurements.Measure;
import com.measureModel.units.BaseUnit;
import com.measureModel.units.UnitBehavior;

import junit.framework.TestCase;

public class ProtocolTest extends TestCase {
	
	@Test
	public void testCreation() {
		Date aDate = new Date();
		Patient aPatient = new Patient();
		Protocol aProtocol = new Protocol(aDate, aPatient);
		
		assertEquals(aDate, aProtocol.getDate());
		assertEquals(aPatient, aProtocol.getPatient());
	}

}
