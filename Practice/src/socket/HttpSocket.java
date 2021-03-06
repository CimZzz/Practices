package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 测试：通过ServerSocket获取HTTP协议头部
 * 结果：测试成功
 * @author CimZzz
 *
 */
public class HttpSocket {

	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8999);
		
		Socket clientSocket = socket.accept();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		int gg;
		while((gg = reader.read()) != -1)
		{
			System.out.print((char)gg);
		}
	}

}
