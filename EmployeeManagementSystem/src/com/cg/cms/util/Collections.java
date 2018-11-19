package com.cg.cms.util;

import java.util.HashSet;

import com.cg.cms.dto.Employee;

public class Collections {
	public static HashSet<Employee> empSet = new HashSet<Employee>();
	static {
		empSet.add(new Employee(112081, "Naveena",5000.0F));
		empSet.add(new Employee(112081, "Deepu",8000.0F));
		empSet.add(new Employee(112081, "Hasini",7000.0F));
		empSet.add(new Employee(112081, "Abhiram",9000.0F));
		empSet.add(new Employee(112081, "Tandon",5000.0F));
	}
	public static void addEmp(Employee emp)
	{
		empSet.add(emp);
	}
	public static HashSet<Employee> getAllEmp()
	{
		return empSet;}
	public static void delete(Employee e1) {
		// TODO Auto-generated method stub
		
	}
}
