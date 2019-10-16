package model;

public interface EmpService {
	//사원등록
	public void insertEmp(Employee emp);
	//사원이름조회
	public Employee EmpNameList(Employee emp);
	//부서별조회
		
	//부서변경
	public void updateEmp(Employee emp);
	//퇴사처리
	public void deleteEmp(Employee emp);
}
