package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import file.GetFile;

public class BufferedReaderValidation {

	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader(new File(GetFile.getFilePath("txtFolder/BufferedReaderValidation.txt"))));
			
			int c;
			
			while((c=bufferedReader.read())!=-1)
			{
				System.out.print((char)c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
