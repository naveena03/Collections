package com.cg.cms.service;

import java.util.HashSet;
import java.util.regex.Pattern;


import com.cg.cms.dao.EmployeeDaoClass;
//import com.cg.cms.EmployeeDaoClass;
import com.cg.cms.dao.EmployeeDaoInterface;
import com.cg.cms.dto.Employee;
import com.cg.cms.exception.Employeeexception;

public class EmpServiceClass implements EmpServiceInterface{
EmployeeDaoInterface dao=null;
public EmpServiceClass()
{
dao=new EmployeeDaoClass();	
}
	@Override
	public int addEmployee(Employee ee) throws Employeeexception {
		return dao.addEmployee(ee);
		
	}

	@Override
	public HashSet<Employee> fetchAllEmp() {
		// TODO Auto-generated method stub
		return dao.fetchAllEmp();
	}

	@Override
	public Employee getEmpById(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmpById(empId);
	}

	@Override
	public Employee searchEmpByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateDigit(int num) throws Employeeexception {
		Integer input=new Integer(num);
		String inputStr=input.toString();
		String digitPattern="[0-9]+";
		if(Pattern.matches(digitPattern, inputStr))
		{
			return true;
		}
				
		else
		{
			throw new Employeeexception("Invalid Input"+"Only Digits are allowed ex 4567");
		}
	}

	@Override
	public boolean ValidateName(String name) throws Employeeexception {
		String namePattern="[A-Z][a-z]+";
		if(Pattern.matches(namePattern, name))
		{
			return true;
		}
		else
		{
			throw new Employeeexception("Invalid Input");
		}
		
	}

}
