package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DAO;
import model.Employee;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 사원등록
	public void insertEmp(Employee emp) {
		conn = DAO.getConnect();
		String sql = "insert into Employee values(emp.nextval,?,?,?,sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getEmpname());
			pstmt.setString(2, emp.getEmpdep());
			pstmt.setInt(3, emp.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	//사원 이름 조회
	public void EmpNameList(Employee emp) {
		conn = DAO.getConnect();
		String sql = "select * from employee where emp_name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,emp.getEmpname());
			rs=pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	// 퇴사처리
	public void deleteEmp(Employee emp) {
		conn = DAO.getConnect();
		String sql = "delete from Employee where emp_id=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpid());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
