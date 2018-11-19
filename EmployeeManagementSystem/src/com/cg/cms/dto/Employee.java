package com.cg.cms.dto;


public class Employee implements Comparable<Employee>{
	private int empId;
	private String Empid;
	private float empSal;
	
	public Employee(int empId, String empid2, float empSal) {
		super();
		this.empId = empId;
		Empid = empid2;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Empid=" + Empid + ", empSal="
				+ empSal + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		Empid = empid;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(emp.empId == this.empId) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return empId;
	}
	public int compareTo(Employee emp) {
		if(emp.empId<this.empId) {
			return -1;
		}
		else if(emp.empId == this.empId) {
			return 0;
		}
		else {
			return +1;
		}
	}
	public Object getEmpName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
