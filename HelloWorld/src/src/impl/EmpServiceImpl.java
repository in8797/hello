package impl;

import model.EmpService;
import model.Employee;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();

	@Override
	public void insertEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public Employee EmpNameList(Employee emp) {
		return null;
	}

	@Override
	public void updateEmp(Employee emp) {

	}

	@Override
	public void deleteEmp(Employee emp) {
		dao.deleteEmp(emp);
		System.out.println("삭제 되었습니다.");
	}

}
