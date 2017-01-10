package com.lab.analysis;

import java.util.Date;


/**
 * - shall we use state for open and close, progress
 * - shall we model doctor?
 * - we should have 2 collection one with the analysis/metrics to be made and other with the results
 * - when the collection is fulfilled then we can close the protocol
 * 
 * 
 * @author ressia
 *
 */
public class Protocol {

	private Date date;
	
	private Patient patient;
	
	public Protocol(Date aDate, Patient aPatient) {
		this.date = aDate;
		this.patient = aPatient;
	}

	public Date getDate() {
		return date;
	}

	public Patient getPatient() {
		return patient;
	}

}
