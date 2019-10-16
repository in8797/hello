package com.dbpackage.impl;

import java.util.List;


import com.dbpackage.model.Student;
import com.dbpackage.model.StudentService;






public class StudentServiceImpl implements StudentService{
	StudentDao dao = new StudentDao();
	@Override
	public void insertStudent(Student student) {
		dao.insertStudent(student);
	}

	@Override
	public List<Student> getStudentList() {
		List<Student> list = dao.getStudentList();
		return list;
		
	}

	@Override
	public Student getStudent(String stuNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
