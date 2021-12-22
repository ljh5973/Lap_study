package edu.java.sproject.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import edu.java.sproject.dto.UserDto;
import oracle.jdbc.driver.OracleDriver;

public class UserDaoImpl implements UserDao {

	private List<UserDto> dto;
	private static UserDaoImpl instance = null;
	
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	private UserDaoImpl() {

	}

	public static UserDaoImpl getInstance() {
		if (instance == null) {
			instance = new UserDaoImpl();

		}
		return instance;
	}

	@Override
	public String idFind(UserDto dto) {
		String result = "";
		

		try {
			DriverManager.registerDriver(new OracleDriver());

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from userinfo";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(sql);
			while (rs.next()) {

				if (rs.getString(3).equals(dto.getUserName())
						&& rs.getString(6).equals(Integer.toString(dto.getPhone()))) {
					result = rs.getString(1);

				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
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
	public int insert(UserDto dto) {
		int result = 0;

		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(url, user, password);

			StringBuilder sql = new StringBuilder();
			sql.append("insert into userinfo (userId, userPw,userName,userEmail,userAddress,userPhone) ");
			sql.append("values (?,?,?,?,?,?)");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getUserId());
			pstmt.setString(2, dto.getUserPw());
			pstmt.setString(3, dto.getUserName());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getAddress());
			pstmt.setInt(6, dto.getPhone());

			result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;

	}

	@Override
	public String pwFind(UserDto dto) {
		String result = "";

		
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection(url, user, password);
			String sql= "select * from userinfo";
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery(sql);
			
			while(rs.next()) {
				if(rs.getString(1).equals(dto.getUserId())&&rs.getString(4).equals(dto.getEmail())) {
					result=rs.getString(2);
				}
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
		return result;
	}

	@Override
	public UserDto mainLogin(UserDto dto) {
		UserDto result=new UserDto();
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection(url, user, password);
			String sql="select * from userinfo";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery(sql);
			
			while(rs.next()) {
				if(dto.getUserId().equals(rs.getString(1))&&dto.getUserPw().equals(rs.getString(2))) {
					result.setUserId(rs.getString(1));
					result.setUserPw(rs.getString(2));
					result.setUserName(rs.getString(3));
					result.setEmail(rs.getString(4));
					result.setAddress(rs.getString(5));
					result.setPhone(Integer.parseInt(rs.getString(6)));
				}
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
		return result;
	}

}
