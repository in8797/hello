package com.dbpackage.control;

import java.util.List;
import java.util.Scanner;

import com.board.model.BoardDB;
import com.dbpackage.impl.StudentServiceImpl;
import com.dbpackage.model.Student;
import com.dbpackage.model.StudentService;

public class StudentProc {

	Scanner sc = new Scanner(System.in);
	StudentService service=new StudentServiceImpl();

	public void excute() {
		System.out.println("실행");
		while (true) {
			int menu = 0;
			System.out.println("1.생성 2.전체조회 3.단건조회");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createStudent();
			} else if (menu == 2) {
				searchList();
			} else if (menu == 3) {
				searchStudent();

			} else if (menu == 4) {
				break;
			}

		}
	}
	public void createStudent() {
		System.out.println("학생번호 입력:");
		String stuNo=sc.nextLine();
		System.out.println("학생이름 입력:");
		String name =sc.nextLine();
		System.out.println("전공 입력:");
		String major =sc.nextLine();
		Student student=new Student(stuNo, name, major);
		service.insertStudent(student);
		
	}
	public void searchList() {
		System.out.println("-----------------------[전체글]------------------------");
		System.out.println("=====================================================");
		System.out.println("|  학생번호   |   이름     |    전공       |");
		System.out.println("=====================================================");

		List<Student> stu = service.getStudentList();
		for (Student student : stu) {
			System.out.println("학생번호 : " + student.getStuNo() + ", 이름 : " + student.getName() + ", 전공 : "
					+ student.getMajor());
		}
	
		
	}
	public void searchStudent() {
		
	}

}
