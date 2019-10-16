package control;

import java.util.Scanner;

import impl.EmpServiceImpl;
import model.EmpService;
import model.Employee;

public class DBProc {
	Scanner sc = new Scanner(System.in);
	EmpService service = new EmpServiceImpl();

	public void execute() {
		while (true) {
			int menu = 0;

			System.out.println("1.사원등록 2.사원이름조회 3.부서별 조회 4.부서변경 5.퇴사처리");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("사원등록");
				creatEmp();
			} else if (menu == 2) {
				System.out.println("사원이름조회");
				EmpNamelist();
			} else if (menu == 3) {
				System.out.println("부서별 조회");
				EmpDep();
			} else if (menu == 4) {
				System.out.println("부서변경");
				Empupdate();
			} else if (menu == 5) {
				System.out.println("퇴사처리");
				deleteEmp();
			}

		}
	}

	private void deleteEmp() {
		System.out.println("삭제할 사원번호 : ");
		int emp_id = sc.nextInt();
		Employee emp = new Employee();
		emp.setEmpid(emp_id);
		service.deleteEmp(emp);
	}

	private void Empupdate() {
		// TODO Auto-generated method stub

	}

	private void EmpDep() {
		// TODO Auto-generated method stub

	}

	private void EmpNamelist() {
		// TODO Auto-generated method stub

	}

	private void creatEmp() {
		System.out.println("사원명 : ");
		String empname = sc.nextLine();
		System.out.println("부서 : ");
		String empdep = sc.nextLine();
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		Employee emp = new Employee();
		emp.setEmpname(empname);
		emp.setEmpdep(empdep);
		emp.setSalary(salary);
		service.insertEmp(emp);
	}

}
