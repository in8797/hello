package com.board.model;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastNmae;
	private String email;
	private String hireDate;
	private int salary;
	private String jobId;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	@Override
	
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastNmae=" + lastNmae + ", email="
				+ email + ", hireDate=" + hireDate + ", salary=" + salary + ", jobId=" + jobId + "]";
	}

}
