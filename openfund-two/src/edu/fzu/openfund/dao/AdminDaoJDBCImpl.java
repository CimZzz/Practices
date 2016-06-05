package edu.fzu.openfund.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

import edu.fzu.openfund.util.DBUtils;

public class AdminDaoJDBCImpl implements AdminDao{

	public Boolean validate(String username, String userpwd) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		Boolean flag=false;
		
		try{
			conn=DBUtils.getConnection();
			pstmt=(PreparedStatement) conn.prepareStatement("select * from admins where name=? and pwd=?");
			pstmt.setString(1, username);
			pstmt.setString(2, userpwd);
			rset=pstmt.executeQuery();
			if(rset.next()){
				flag=true;
			}

			return flag;
		}catch(Exception e)
		{
			e.printStackTrace();
			return flag;
		}finally {
			DBUtils.releaseResource(conn, pstmt, rset);
		}
	}

}
