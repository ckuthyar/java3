package com.sangamone.pkg1;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
@Entity
@Table(name="contribution")
public class FloodReliefModelEmp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String empId;
	
	private String empName;
	private String empOrg;
	private String empState;
	private LocalDate date1;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpOrg() {
		return empOrg;
	}
	public void setEmpOrg(String empOrg) {
		this.empOrg = empOrg;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public LocalDate getDate1() {
		return date1;
	}
	public void setDate1(LocalDate date1) {
		this.date1 = date1;
	}
	public FloodReliefModelEmp(String empName, String empOrg, String empState, LocalDate date1) {
		super();
		this.empName = empName;
		this.empOrg = empOrg;
		this.empState = empState;
		this.date1 = date1;
	}
	
	
	
	
	
}
