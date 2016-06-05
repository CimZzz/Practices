package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import file.GetFile;

/**
 * 用来测试上传与下载流
 * 结论：在DataOutput至Png时无法再输入String数据
 * @author CimZzz
 *
 */
public class DownLoad_UpLoad_Stream {
	
	public static void upLoad() throws IOException
	{
		String path=GetFile.getFilePath("txtFolder");
		File downloadfile=new File(GetFile.getFilePath("txtFolder/main_setting.png"));
		File uploadfile=new File(path,"DownLoad_UpLoad_Stream.png");
		uploadfile.createNewFile();
		DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(uploadfile));
		DataInputStream dataInputStream=new DataInputStream(new FileInputStream(downloadfile));
		
		int read;
		
		while((read=dataInputStream.read())!=-1)
		{
			dataOutputStream.writeByte(read);
		}
		dataOutputStream.writeByte((byte)-1);
		
		dataOutputStream.write("哈哈".getBytes());
		
		dataOutputStream.flush();
		dataInputStream.close();
		dataOutputStream.close();
		
		System.out.println("上传成功");
	}
	
	public static void download() throws IOException
	{
		String path=GetFile.getFilePath("txtFolder");
		File uploadfile=new File(path,"DownLoad_UpLoad_Stream.png");
		DataInputStream dataInputStream=new DataInputStream(new FileInputStream(uploadfile));

		int read;
		StringBuilder stringBuilder=new StringBuilder();

		while((read=dataInputStream.read())!=-1)
		{
		}
		
		while((read=dataInputStream.read())!=-1)
		{
			stringBuilder.append((char)read);
		}

		dataInputStream.close();
		
		System.out.println(stringBuilder.toString());
	}
	
	public static void main(String[] args) throws IOException
	{
		upLoad();
		download();
	}
}
