package com.demo.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.demo.entities.Students;
import com.demo.utilities.DbCon;

public class StudentDao implements DaoInterface<Students> {
	private static String TABLE = "tbl_1882246_students";

	@Override
	public ArrayList<Students> findall() {
		// Get SQL connection
		Connection co = DbCon.getConnection();

		ArrayList<Students> std = new ArrayList<Students>();
		
		try {
			String sql = "SELECT * FROM " + TABLE;
			PreparedStatement ps = co.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Students student = new Students();
				student.setStudent_id(rs.getInt("student_id"));
				student.setStudent_name(rs.getString("student_name"));
				student.setGender(rs.getString("gender"));
				student.setClass_type(rs.getString("class_type"));
				student.setEmail(rs.getString("email"));
				student.setMajor(rs.getString("major"));
				//System.out.println(student.getStudent_name());

				std.add(student);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}

		return std;
	}

	@Override
	public Students findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Students student) {
		
		Connection con = DbCon.getConnection();
		System.out.println("Update got hit!!!");
		
		try {
			String sql = "UPDATE " + TABLE+ " SET email=?  where student_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, student.getEmail());
			ps.setInt(2, student.getStudent_id());
				
			System.out.println(ps.executeUpdate());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}

	}

	@Override
	public Students save(Students student) {
		System.out.println("Save got hit....");
		int count=0;
		Connection con = DbCon.getConnection();
		
		try {
			String sql = "INSERT INTO " + TABLE+ " (student_name, gender, email, class_type, major) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,student.getStudent_name());
			ps.setString(2, student.getGender());
			ps.setString(3, student.getEmail());
			ps.setString(4,  student.getClass_type());
			ps.setString(5,  student.getMajor());
			
			count=ps.executeUpdate();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}
		return student;
	}

	@Override
	public void delete(int id) {
		Connection con=DbCon.getConnection();
		try {
			String sql= "Delete from " +TABLE+ " where student_id=?";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbCon.closeConnection();
		}
		
	}

}
