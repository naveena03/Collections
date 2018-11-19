package com.cg.cms.dao;

import java.util.HashSet;

import org.omg.CORBA.UserException;

import com.cg.cms.dto.Employee;
import com.cg.cms.exception.Employeeexception;
import com.cg.cms.util.Collections;

public class EmployeeDaoClass implements EmployeeDaoInterface{
		
	@Override
    public int addEmployee(Employee ee) throws Employeeexception {
        Collections.addEmp(ee);
        return ee.getEmpId();
    }

    @Override
    public HashSet<Employee> fetchAllEmp() {
        return Collections.getAllEmp();
        
    }

    @Override
    public Employee getEmpById(int empId) {
        Employee emp = null;
        for(Employee em:Collections.empSet)
        {
            if(em.getEmpId()==empId)
            {
                emp=em;
            }
            
        }
        return emp;
    }

    @Override
    public Employee searchEmpByName(String name) {
    Employee emp = null;
    for(Employee em:Collections.empSet)
    {
        if(em.getEmpName().equals(name))
        {
            emp=em;
        }
        
    }
    return emp;
        
        
        
    }

    @Override
    public int deleteEmp(int empId) {
        boolean flag=false;
        HashSet<Employee> emp=Collections.getAllEmp();
        for(Employee e1:emp)
        {
            if(e1.getEmpId()==empId)
            {
                flag= true;
                Collections.delete(e1);
                break;
            }
            else
            {
                flag=false;
            }
        }
        if(flag)
        {
            return empId;
        }
        else
            return 0;
    }

    @Override
    public Employee updateEmp(int empId, String newName, float newSal) {
        Employee em;
        HashSet<Employee> emp=Collections.getAllEmp();
        for(Employee e1:emp)
        {
            if(e1.getEmpId()==empId)
            {
            em=new Employee( empId,newName,newSal);
            emp.remove(em);
            
            emp.add(em);
                System.out.println("updated successfully");
                return em;
                
            }
        }
        return null;
    }

}



