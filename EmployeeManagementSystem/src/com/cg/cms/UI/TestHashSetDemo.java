package com.cg.cms.UI;

import java.util.HashSet;
import java.util.TreeSet;

import com.cg.cms.dto.Employee;

public class TestHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> emps = new HashSet<Employee>();
		emps.add(new Employee(333,"Vaishali",1000.0F));
		emps.add(new Employee(222,"Naveena",78000.0F));
		emps.add(new Employee(111,"Gowtham",78000.0F));
		System.out.println(emps);
		System.out.println("***********************");
		TreeSet<String> cities = new TreeSet<String>();
		cities.add("Pune");
		cities.add("Hyderabad");
		cities.add("Noida");
		cities.add("Mumbai");
		cities.add("Sahibabad");
		cities.add("Pune");
		System.out.println(cities);
		System.out.println("***********************");
		TreeSet<Employee> emps2 = new TreeSet<Employee>();
		emps2.add(new Employee(333,"Vaishali",1000.0F));
		emps2.add(new Employee(222,"Naveena",78000.0F));
		emps2.add(new Employee(111,"Gowtham",78000.0F));
		System.out.println(emps2);
	}

}
