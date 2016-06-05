
package file;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * 获得项目内的文件路径
 * @author CimZzz
 *
 */
public class GetFile {
	/**
	 * 获得文件的URL,使用“/”正斜杠
	 * @param filepath 文件路径
	 * @return URL
	 */
	public static URL getFileURL(String filepath)
	{
		return GetFile.class.getClassLoader().getResource(filepath);
	}
	
	/**
	 * 获得文件的URI
	 * @param filepath 文件路径
	 * @return URL
	 */
	public static URI getFileURI(String filepath)
	{
		URL url=getFileURL(filepath);
		
		if(url==null)
			return null;
		
		try {
			URI uri=url.toURI();
			return uri;
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 获得文件实际路径
	 * @param filepath 文件路径
	 * @return URL
	 */
	public static String getFilePath(String filepath)
	{

		URL url=getFileURL(filepath);
		
		if(url==null)
			return null;
		
		return url.getPath();
	}
	
	public static void main(String[] args)
	{
		String filepath="txtFolder/GetFile.txt";
		System.out.println(getFilePath(filepath));
		System.out.println(getFileURL(filepath));
		System.out.println(getFileURI(filepath));
	}
}
