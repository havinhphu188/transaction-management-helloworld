package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeHealthInsurance;

public interface OrganizationService {
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);
}