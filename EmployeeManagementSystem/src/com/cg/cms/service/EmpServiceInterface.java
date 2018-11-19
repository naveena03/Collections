package com.cg.cms.service;

import java.util.HashSet;

import com.cg.cms.dto.Employee;
import com.cg.cms.exception.Employeeexception;

public interface EmpServiceInterface {
	public  int addEmployee(Employee ee) throws Employeeexception;
	public HashSet<Employee> fetchAllEmp();
	public Employee getEmpById(int empId);
	public Employee searchEmpByName(String name);
	public int deleteEmp(int empId);
	public Employee updateEmp(int empId,String newName,float newSal);
	public boolean validateDigit(int num) throws Employeeexception;
	public boolean ValidateName(String name) throws Employeeexception;
}
