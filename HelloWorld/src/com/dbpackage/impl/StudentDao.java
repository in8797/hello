package com.dbpackage.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import com.board.common.DAO;
import com.dbpackage.common.Dao;
import com.dbpackage.model.Student;

public class StudentDao {
	Connection conn=null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Student> getStudentList() {
		conn = Dao.getConnect();
		String sql="select * from student";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
		
		
		
		
	}
	
	
	
	public void insertStudent(Student student) {
		conn=Dao.getConnect();
		String sql="insert into student values (?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, student.getStuNo());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getMajor());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	

	}
	

}
