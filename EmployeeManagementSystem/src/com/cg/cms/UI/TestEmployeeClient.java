package com.cg.cms.UI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.cms.dto.Employee;
import com.cg.cms.exception.Employeeexception;
//import com.cg.cms.service;
//import com.cg.cms.service.EmployeeServiceImp1;
import com.cg.cms.service.EmpServiceClass;

public class TestEmployeeClient {
	static Scanner sc = null;//new Scanner(System.in);
	static EmpServiceClass empSer = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc =new Scanner(System.in);
		empSer =new EmpServiceClass();
	     int choice=0;
	     while(true)
	 	{ 
	 		
	 		System.out.println("What you wan to do?");
	 		System.out.println("1:Add Emp \t2:Fetch All");
	 		System.out.println("3:Delete Emp \t4:Search Emp By Id");
	 		System.out.println("5:Search Emp By Name \t6:Update Emp");
	 		System.out.println("7:Exit");
	 		System.out.println("enter ur choice");
	 		choice=sc.nextInt();
	 switch(choice)
	 {
	 case 1:addEmp();
	 break;
	 case 2:showEmpInfo();break;
	 
	 case 3 :deleteEmployee();
	 break;
	 case 4 :System.out.println("Enter id");
	 int id = sc.nextInt();
	 Employee empId = empSer.getEmpById(id);
	 
	 {
		 System.out.println(empId);
	 }
	 break;
	 case 5: System.out.println("Enter name");
	 		String name1 = sc.next();
	 		Employee emp = empSer.searchEmpByName(name1); {
	 			System.out.println(emp);
	 		}
	 		
	 	break;	
	 

	 }
	 	}
	 }
	 private static void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}
	private static void showEmpInfo() {
	 	HashSet<Employee> empSet= empSer.fetchAllEmp();
	 	System.out.println("------------------");
	 	Iterator<Employee> it=empSet.iterator();
	 	System.out.println("-----------------");
	 	System.out.println("empId\tempNmae\tEmpSal");
	 	while(it.hasNext())
	 	{
	 		Employee ee=it.next();
	 		//System.out.println(ee.getEmpId()+"\t\t"ee.getEmpName()+"\t\t"+ee.getEmpSalary()*/);
	 	}
	 	System.out.println("-------------------");
	 }
	 private static void addEmp() {
	 	System.out.println("enter empId");
	 	int eid=sc.nextInt();
	 	try {
	 		if(empSer.validateDigit(eid))
	 		{
	 			System.out.println("enter name");
	 			String name=sc.next();
	 			if(empSer.ValidateName(name))
	 			{
	 				System.out.println("enter Salary");
	 				float sal=sc.nextFloat();
	 				Employee ee=new Employee(eid,name,sal);
	 				int empId=empSer.addEmployee(ee);
	 				System.out.println(empId+"Added Successfully");
	 						
	 			}
	 		}
	 	} catch (Employeeexception e) {
	 		
	 		e.printStackTrace();
	 	}
	 	
	 }
	 }
