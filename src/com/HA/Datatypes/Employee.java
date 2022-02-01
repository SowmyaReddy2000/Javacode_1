package com.HA.Datatypes;

public class Employee {

	public static void main(String[] args) {
			
		EmpTest.companyname="HA";
		
		EmpTest emp1 = new EmpTest();
		EmpTest emp2 = new EmpTest();
		EmpTest emp3 = new EmpTest();

		emp1.empId=101;
		emp1.empname="John";
		emp1.empsalary=6000;
	
		System.out.println(emp1.empId);
		System.out.println(emp2.empId);
		System.out.println(emp3.empId);
		
	}

}
