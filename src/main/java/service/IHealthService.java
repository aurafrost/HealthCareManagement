package service;

import java.util.List;

import controller.Drug;
import controller.OutPatient;
import controller.Patient;
import controller.PatientEmployee;
import controller.PatientStudent;
import dao.HealthDao;

public interface IHealthService {
	public void add(Drug d);
	public void update(Drug d);
	public List<Drug> getStockDetails();
	public void add(PatientStudent p);
	public List<Patient> getPatientDetails();
}
