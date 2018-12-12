package controller;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PatientStudent")
@PrimaryKeyJoinColumn(name="patientName")
public class PatientStudent extends Patient{
	private double bedCharge,xRayCharge,scanningCharge,medicineCharge;
	public PatientStudent(String patientName, String type, double bedCharge, double xRayCharge, double scanningCharge,
			double medicineCharge) {
		super(patientName, type);
		this.bedCharge = 0;
		this.xRayCharge = 0;
		this.scanningCharge = 0;
		this.medicineCharge = 0;
	}

	public PatientStudent() {
		
	}
	
	public double getBedCharge() {
		return bedCharge;
	}
	public double getxRayCharge() {
		return xRayCharge;
	}
	public double getScanningCharge() {
		return scanningCharge;
	}
	public double getMedicineCharge() {
		return medicineCharge;
	}
	
}
