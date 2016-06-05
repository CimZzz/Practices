package string;

/**
 * 测试：String类的startWith()方法可否匹配字符串
 * 结果：可以，并且 endWith() 可以后端匹配
 * @author CimZzz
 *
 */
public class StartWith {
	private static final String str1 = "http://sdsdsdsdds";
	private static final String str2 = "/sdsdsdsdds";

	public static void main(String[] args) {
		
		System.out.println(str1.startsWith("http://"));

		System.out.println(str1.endsWith(str2));
	}

}
