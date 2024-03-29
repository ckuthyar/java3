package com.sangamone.pkg1;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
@Entity
@Table(name="contribution")
public class FloodReliefModelContribution {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cId;
	
	private String empId;
	private int amt;
	private LocalDate date2;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public LocalDate getDate2() {
		return date2;
	}
	public void setDate2(LocalDate date2) {
		this.date2 = date2;
	}
	public FloodReliefModelContribution(String empId, int amt, LocalDate date2) {
		super();
		this.empId = empId;
		this.amt = amt;
		this.date2 = date2;
	}
	
	

}
