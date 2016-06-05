package mysql;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import time.DelayedTime;

/**
 * 使用Statement与PreparedStatement操作数据
 * 
 * 向学生表内插入数据
 * 
 * 删除学生表某个数据
 * 
 * 删除全部数据
 * @author CimZzz
 *
 */
public class OperateData {
	private static final String Statement_sql="insert into tb_student(sid,name) values";
	private static final String PreparedStatement_sql="insert into tb_student(sid,name) values(?,?)";
	
	public static void insert_Statement(String id,String name)
	{
		try {
			Connect.getConnection().createStatement().execute(Statement_sql+"("+id+","+name+")");
		} catch (SQLException e) {
			System.out.println("Insert Failed!");
		}
	}
	
	public static void insert_PreparedStatement(String id,String name)
	{
		try {
			PreparedStatement preparedStatement=Connect.getConnection().prepareStatement(PreparedStatement_sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.execute();
		} catch (SQLException e) {
			System.out.println("Insert Failed!");
		}
	}
	
	public static void s (String id,String name)
	{
		try {
			Connect.getConnection().createStatement().execute("select * from tb_student where name='"+name+"'"+" and sid="+id);
		} catch (SQLException e) {
			System.out.println("Insert Failed!");
		}
	}
	
	
	public static void main(String[] args) {
		DelayedTime delayedTime=new DelayedTime();
		
		delayedTime.start();
		for(int i=0;i<20;i++)
			insert_Statement("1", "2");
		System.out.println("Statement_Insert:"+delayedTime.end());

		delayedTime.start();
		for(int i=0;i<20;i++)
			insert_PreparedStatement("2","3");
		System.out.println("PreparedStatement_Insert:"+delayedTime.end());

	}

}
