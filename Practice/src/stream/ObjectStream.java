package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import file.GetFile;

/**
 * 对象输入输出流的使用
 * @author CimZzz
 *
 */
public class ObjectStream {
	private static final String FilePath="txtFolder/ObjectStreamPractice.txt";
	
	private static void Output() throws FileNotFoundException, IOException
	{
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File(GetFile.getFilePath(FilePath))));
		TestClass t=new TestClass();
		t.field1=100;
		t.field2=200;
		objectOutputStream.writeObject(t);
		objectOutputStream.flush();
		objectOutputStream.close();
	}
	
	private static TestClass Input() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(new File(GetFile.getFilePath(FilePath))));
		
		TestClass t=(TestClass) objectInputStream.readObject();
		return t;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Output();
		
		TestClass t=Input();
		
		System.out.println(t);
	}

}


class TestClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 100;//串行版本号

	public int field1;
	public int field2;
	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Field1=");
		sb.append(field1);
		sb.append("  ");
		sb.append("Field2=");
		sb.append(field2);
		return sb.toString();
	}
}