package controller;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PatientEmployee")
@PrimaryKeyJoinColumn(name="patientName")
public class PatientEmployee extends Patient{
	private double bedCharge,xRayCharge,scanningCharge,medicineCharge;
	private int daysInHospital;
	public PatientEmployee(String patientName, String type, double bedCharge, double xRayCharge, double scanningCharge,
			double medicineCharge, int daysInHospital) {
		super(patientName, type);
		this.bedCharge = bedCharge;
		this.xRayCharge = xRayCharge;
		this.scanningCharge = scanningCharge;
		this.medicineCharge = medicineCharge;
		this.daysInHospital = daysInHospital;
	}

	public PatientEmployee() {
		
	}

	public double getBedCharge() {
		return bedCharge;
	}
	public void setBedCharge(double bedCharge) {
		this.bedCharge = bedCharge;
	}
	public double getxRayCharge() {
		return xRayCharge;
	}
	public void setxRayCharge(double xRayCharge) {
		this.xRayCharge = xRayCharge;
	}
	public double getScanningCharge() {
		return scanningCharge;
	}
	public void setScanningCharge(double scanningCharge) {
		this.scanningCharge = scanningCharge;
	}
	public double getMedicineCharge() {
		return medicineCharge;
	}
	public void setMedicineCharge(double medicineCharge) {
		this.medicineCharge = medicineCharge;
	}
	public int getDaysInHospital() {
		return daysInHospital;
	}
	public void setDaysInHospital(int daysInHospital) {
		this.daysInHospital=daysInHospital;
	}
	
}
