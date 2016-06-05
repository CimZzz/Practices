package stream;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 实现输出流的借口向StringBuilder输出字符串
 * @author CimZzz
 *
 */
public class OutputToStringStream {

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder();
		OutputStream outputStream=new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				stringBuilder.append((char)b);
			}
		};
		try {
			outputStream.write("StringTest".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			outputStream.flush();
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(stringBuilder.toString());
	}

}
