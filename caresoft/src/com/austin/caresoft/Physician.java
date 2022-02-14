package com.austin.caresoft;
import java.util.ArrayList;
import java.util.Date;

public class Physician {
	    protected Integer id;
	    protected int pin;

	    public Integer getId() {
	    	return id;
	    }
	    public void setId(Integer id) {
	    	this.id = id;
	    }
	    public int getPin() {
	    	return pin;
	    }
	    public void setPin(int pin) {
	    	this.pin = pin;
	    }

	
//... imports class definition...
    
// Inside class:    
    private ArrayList<String> patientNotes;
	
// TO DO: Constructor that takes an ID
    public Physician (Integer id) {
    	this.id = id;
    }
// TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	int pinLength = String.valueOf(pin).length();
    	if(pinLength != 4) {
    		return false;
    	} else {
    		this.setPin(pin);
    		return true;
    	}
    }
    
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(confirmedAuthID == this.getId()) {
    		return true;
    	} else {
    		return false;
    	}
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // TO DO: Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	


}
