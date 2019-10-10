package com.board.impl;

import java.util.List;

import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmployeeserviceImpl implements EmployeeService {
	EmpDAO dao = new EmpDAO();

	@Override
	public List<Employee> getEmpList() {
		List<Employee> list = dao.getEmpList();
		return list;
	}

	@Override
	public Employee getEmployee(int empNo) {
		return null;
	}

	@Override
	public void insertEmployee(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {

	}

	@Override
	public Employee deleteEmployee(int empNp) {
		dao.deleteEmp(empNp);
		return null;
	}

}
