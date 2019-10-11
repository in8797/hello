package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.EmployeeserviceImpl;
import com.board.model.Board;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	List<Employee> employees = new ArrayList<>();
	EmployeeService service = new EmployeeserviceImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.삭제 5.변경");
			int menu = 0;
			try {
				menu = sc.nextInt(); // error 발생가능한 곳
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴를 선택해주세요.");
				sc.nextLine();
//				e.printStackTrace();
			}

			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				getBoardDelete();
			} else if (menu == 5) {
				getupdateBoard();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	public void writeBoard() {
		System.out.println("직원등록 : ");
		System.out.println("직원번호입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요. : ");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요 : ");
		String lastNmae = sc.nextLine();
		System.out.println("email을 입력하세요 : ");
		String email = sc.nextLine();
		System.out.println("입사일을 입력하세요 : ");
		String hireDate = sc.nextLine();
		System.out.println("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("직종를 입력하세요 : ");
		String jobId = sc.nextLine();
		// 입력 받은 값을 emp 인스턴스에 담는다.
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastNmae);
		emp.setEmail(email);
		emp.setHireDate(hireDate);// 2010-10-05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);

	}

	public void getBoard() {
		System.out.println("한건조회");
		System.out.println("조회할 번호를 입력 : ");
		int EmployeeNo = sc.nextInt();
		Employee emp = service.getEmployee(EmployeeNo);
		System.out.println(emp);
	}

	public void getBoardList() {

		System.out.println("전체글조회");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public void getBoardDelete() {
		System.out.println("삭제");
		System.out.println("삭제할 번호를 입력 : ");
		int EmpID = sc.nextInt();
		Employee emp = service.deleteEmployee(EmpID);

	}

	public void getupdateBoard() {
		System.out.println("직원등록 : ");
		System.out.println("직원번호입력 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요. : ");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요 : ");
		String lastNmae = sc.nextLine();
		System.out.println("email을 입력하세요 : ");
		String email = sc.nextLine();
		System.out.println("입사일을 입력하세요 : ");
		String hireDate = sc.nextLine();
		System.out.println("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		System.out.println("직종를 입력하세요 : ");
		String jobId = sc.nextLine();
		// 입력 받은 값을 emp 인스턴스에 담는다.
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastNmae);
		emp.setEmail(email);
		emp.setHireDate(hireDate);// 2010-10-05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);

//		service.updateBorad(board, boardAry);
	}
}
