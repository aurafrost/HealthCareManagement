package controller;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="OutPatient")
@PrimaryKeyJoinColumn(name="patientName")
public class OutPatient extends Patient{
	private double serviceFee;
	
	public OutPatient(String patientName, String type, double serviceFee) {
		super(patientName, type);
		this.serviceFee = serviceFee;
	}

	public OutPatient() {
		
	}
	
	public double getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	
}
