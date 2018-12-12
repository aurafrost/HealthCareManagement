package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import controller.Drug;
import controller.OutPatient;
import controller.Patient;
import controller.PatientEmployee;
import controller.PatientStudent;
@Repository
public class HealthDao implements IHealthDao{
	@Autowired
	HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public void saveDrug(Drug d) {
		ht.save(d);
	}
	
	public void deleteDrug(Drug d) {
		ht.delete(d);
	}
	
	public void updateDrug(Drug d) {
		ht.update(d);
	}
	public Drug getByName(String name) {
		Drug d=ht.get(Drug.class, name);
		return d;
	}
	
	public List<Drug> getStockDetails(){
		List<Drug>list=new ArrayList<Drug>();
		list=ht.loadAll(Drug.class);
		return list;
	}
	public void savePatient(PatientStudent p) {
		ht.save(p);
	}
	public void savePatient(PatientEmployee p) {
		ht.save(p);
	}
	public void savePatient(OutPatient p) {
		ht.save(p);
	}
	public List<Patient> getPatientDetails(){
		List<Patient>list=new ArrayList<Patient>();
		list=ht.loadAll(Patient.class);
		return list;
	}
}
