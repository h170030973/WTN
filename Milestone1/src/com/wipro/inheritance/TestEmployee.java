package com.wipro.inheritance;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setAnnualSalary(50000);
		e.setStartYear(2000);
		e.setInsuranceNumber("123456789");
		System.out.println("Name: "+e.name);
		System.out.println("Annual Salary: "+e.getAnnualSalary());
		System.out.println("Start year: "+e.getStartYear());
		System.out.println("Insurance Number: "+e.getInsuranceNumber());
	}
}
