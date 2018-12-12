package dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import controller.Drug;

public interface IHealthDao {
	
	public void setHt(HibernateTemplate ht);

	public void saveDrug(Drug c);
	
	public void deleteDrug(Drug c);
	
	public void updateDrug(Drug c);
	
	public Drug getByName(String name);
	
	public List<Drug> getStockDetails();
}
