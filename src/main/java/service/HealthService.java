package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.Drug;
import controller.OutPatient;
import controller.Patient;
import controller.PatientEmployee;
import controller.PatientStudent;
import dao.HealthDao;
@Service
public class HealthService implements IHealthService{
	@Autowired
	HealthDao hd;
	
	public void add(Drug d) {
		hd.saveDrug(d);
	}
	public void update(Drug d) {
		hd.updateDrug(d);
	}
	public List<Drug> getStockDetails() {
		return hd.getStockDetails();
	}
	public void add(PatientStudent p) {
		hd.savePatient(p);
	}
	public void add(PatientEmployee p) {
		hd.savePatient(p);
	}
	public void add(OutPatient p) {
		hd.savePatient(p);
	}
	public List<Patient> getPatientDetails() {
		return hd.getPatientDetails();
	}
}
