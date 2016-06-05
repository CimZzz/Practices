package edu.fzu.openfund.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import edu.fzu.openfund.domain.Fund;
import edu.fzu.openfund.util.DBUtils;

public class FundDaoJDBCImpl implements FundDao {

	public List<Fund> findAllFunds() {
	List<Fund> fundList=new ArrayList<Fund>();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet resultSet=null;
	
	try{
		conn=DBUtils.getConnection();
		String sql="select * from fund where 1=1";
		pstmt=(PreparedStatement) conn.prepareStatement(sql);
		resultSet=pstmt.executeQuery();
		while(resultSet.next())
		{
			Fund fund=new Fund();
			fund.setFundName(resultSet.getString("FUND_NAME"));
			fund.setFundDes(resultSet.getString("FUND_DES"));
			fund.setFundStatus(resultSet.getString("FUND_STATUS"));
			fund.setFundCreateDate(resultSet.getDate("CREATED_DATE"));
			fund.setFundNo(resultSet.getInt("FUND_NO"));
			fund.setFundPrice(resultSet.getDouble("FUND_PRICE"));
			fundList.add(fund);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		DBUtils.releaseResource(conn, pstmt, resultSet);
	}
	return fundList;
	}
}
