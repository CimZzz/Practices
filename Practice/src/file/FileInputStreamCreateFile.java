package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试FileInputStream是否会创建文件
 * 结果：Input不能创建文件,而Output可以
 * @author CimZzz
 *
 */
public class FileInputStreamCreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fileOutputStream=new FileOutputStream(new File(
//				"/Users/CimZzz/Documents/EclipseProject/Practices/Practice/bin/txtFolder/TextTEST.txt"));
//		fileOutputStream.write(24);
//		fileOutputStream.close();
		
		
		FileInputStream fileInputStream=new FileInputStream(new File(
				"/Users/CimZzz/Documents/EclipseProject/Practices/Practice/bin/txtFolder/TextTEST.txt"));
		fileInputStream.close();
	}

}
