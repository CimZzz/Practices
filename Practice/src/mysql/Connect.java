package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Date;

/**
 * 数据库连接
 * 1.加载驱动
 * 2.通过DriverManager获取Connection
 * @author CimZzz
 *
 */
public class Connect {

	private static final String driver="com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3307/db_practice?useUnicode=true&characterEncoding=UTF-8";
	private static final String usrname="root";
	private static final String usrpwd="root";
	
	public static Connection getConnection()
	{
		try{
			Class.forName(driver);
			Connection connection=DriverManager.getConnection(url,usrname,usrpwd);
			return connection;
		}catch(Exception e)
		{
			System.out.println("GetConnection Failed!");
			return null;
		}
	}
	
	
	public static void main(String[] args)
	{
		getConnection();
		Calendar s;
		
	}
	
	
}
