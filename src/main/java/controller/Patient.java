package controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
@Inheritance(strategy=InheritanceType.JOINED)
public class Patient {
	@Id
	protected String patientName;
	protected String type;
	public Patient(String patientName, String type) {
		this.patientName = patientName;
		this.type = type;
	}
	public Patient() {
		
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}