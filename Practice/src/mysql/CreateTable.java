package mysql;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 建立一张学生表
 * 1.id 10个字符
 * 2.name 10个宽字符
 * 
 * 删除一张学生表
 * @author CimZzz
 *
 */
public class CreateTable {

	private static final String tableName="create table tb_student("
			+ "id int auto_increment primary key,"
			+ "sid varchar(10) not null,"
			+ "name nvarchar(10) not null)";
	
	private static final String deleteTable="drop table tb_student";
	
	public static void createTable()
	{
		Connection connection=Connect.getConnection();
		
		try {
			connection.createStatement().execute(tableName);
			
			System.out.println("CreateTable Success!");
		} catch (SQLException e) {
			System.out.println("CreateTable Failed!");
		} finally {
			try {
				if(connection!=null&&!connection.isClosed())
					connection.close();
			} catch (SQLException e) {}
		}
	}
	
	
	public static void deleteTable()
	{
		Connection connection=Connect.getConnection();
		try {
			connection.createStatement().execute(deleteTable);
			
			System.out.println("DeleteTable Success!");
		} catch (SQLException e) {
			System.out.println("DeleteTable Failed!");
		} finally {
			try {
				if(connection!=null&&!connection.isClosed())
					connection.close();
			} catch (SQLException e) {}
		}
	}
	
	public static void main(String[] args) {
		createTable();
		//deleteTable();
	}

}
