package edu.java.sproject.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.java.sproject.dto.RoomDto;
import oracle.jdbc.driver.OracleDriver;

public class RoomDaoImpl implements RoomDao{

	private List<RoomDto> dto;
	private static RoomDaoImpl instance =null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private RoomDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static RoomDaoImpl getInstance() {
		if(instance==null) {
			instance=new RoomDaoImpl();
		}
		return instance;
	}
	
	
	@Override
	public int createRoom(RoomDto dto) {
		int result=0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection(url, user, password);
			
			StringBuilder sql=new StringBuilder();
			sql.append("insert into roominfo(roomNum, title, userName) ");
			sql.append("values (room_seq.nextval, ? ,?)");
			
			pstmt=conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getUserName());
			result=pstmt.executeUpdate();
			System.out.println(result);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public List<RoomDto> showTable() {
		List<RoomDto> list=new ArrayList<>();
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn= DriverManager.getConnection(url, user, password);
			StringBuilder sql=new StringBuilder();
			sql.append("select * from roominfo");
			
			pstmt=conn.prepareStatement(sql.toString());
			
			rs=pstmt.executeQuery(sql.toString());
			
			while(rs.next()) {
				RoomDto dto=new RoomDto();
				dto.setRoomNum(Integer.parseInt(rs.getString(1)));
				dto.setTitle(rs.getString(2));
				dto.setUserName(rs.getString(3));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		return list;
	}

	@Override
	public int roomNum() {
		int result=0;
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection(url, user, password);
			StringBuilder sql=new StringBuilder();
			sql.append("select max(roomNum) from roominfo");
			pstmt= conn.prepareStatement(sql.toString());
			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				result=Integer.parseInt(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
