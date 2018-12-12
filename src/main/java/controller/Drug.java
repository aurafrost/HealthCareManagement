package controller;

import javax.persistence.*;

@Entity
@Table(name="Drug")
public class Drug {
	@Id
	private String drugName;
	private int inStock;
	private String expiryDate;
	
	public Drug(String drugName, int inStock, String expiryDate) {
		this.drugName = drugName;
		this.inStock = inStock;
		this.expiryDate = expiryDate;
	}
	public Drug() {
		// TODO Auto-generated constructor stub
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
