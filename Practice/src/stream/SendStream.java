package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import file.GetFile;

public class SendStream {
	private static void output(Socket socket) throws IOException
	{
		File file=new File(GetFile.getFilePath("txtFolder/main_setting.png"));
		
		FileInputStream input=new FileInputStream(file);
		
		DataOutputStream output=new DataOutputStream(socket.getOutputStream());
		
		output.writeUTF(file.getName());
		
		int read;
		
		while((read=input.read())!=-1)
		{
			output.write(read);
		}
		
		output.flush();
		output.close();
	}

	public static void main(String[] args) throws IOException {
		new Thread(()->{
			try {
				Socket socket=new Socket("localhost", 8888);
				DataInputStream input=new DataInputStream(socket.getInputStream());
				File file=new File("/users/cimzzz/documents",input.readUTF());
				DataOutputStream output=new DataOutputStream(new FileOutputStream(file));
				
				int read;
				
				while((read=input.read())!=-1)
				{
					output.write(read);
					System.out.println(read);
				}
				
				output.flush();
				output.close();
				System.out.println("Success");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		ServerSocket ss=new ServerSocket(8888);
		Socket s=ss.accept();
		output(s);
	}

}
