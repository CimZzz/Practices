package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import file.GetFile;

/**
 * 数据流与字符串流的公用一个读入流与输出流
 * 结果：可以通用一个流
 * @author CimZzz
 *
 */
public class Data_String_Stream {
	public static void main(String[] args)
	{
		try {
			File file=new File(GetFile.getFilePath("txtFolder/Data_String.txt"));
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
			dataOutputStream.writeInt(10);
			dataOutputStream.writeInt(20);
			dataOutputStream.writeInt(30);
			dataOutputStream.flush();
			
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
			outputStreamWriter.write("我在这里等你");
			outputStreamWriter.flush();

			fileOutputStream.close();
			dataOutputStream.close();
			outputStreamWriter.close();
			System.out.println("文件输出流已经关闭");
			
			FileInputStream fileInputStream=new FileInputStream(file);
			DataInputStream dataInputStream=new DataInputStream(fileInputStream);
			
			System.out.println("读入的第一个整型数据为:"+dataInputStream.readInt());
			System.out.println("读入的第二个整型数据为:"+dataInputStream.readInt());
			System.out.println("读入的第三个整型数据为:"+dataInputStream.readInt());
			

			InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
			
			StringBuilder stringBuilder=new StringBuilder();
			
			int read;
			
			while((read=inputStreamReader.read())!=-1)stringBuilder.append((char)read);
			
			System.out.println("读入的字符串为:"+stringBuilder.toString());
			

			fileInputStream.close();
			dataInputStream.close();
			inputStreamReader.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
