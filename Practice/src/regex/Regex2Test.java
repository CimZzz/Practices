package regex;

/**
 * 测试：正向预查
 * 结果：一个有数字和字母组成的字符串中至少有一个字母
 * @author CimZzz
 *
 */
public class Regex2Test {
	
	
	public static void main(String[] args) {
		String testStr = "sdsdsdascacwqdc2ewqfc3rqfswaf32r";

		String testStr2 = "312312e12e312312";

		String testStr3 = "31232s";
		
		
		String regex = "^(?=.*[a-zA-Z])[a-zA-Z0-9]{5,10}$";

		System.out.println(testStr.matches(regex));
		System.out.println(testStr2.matches(regex));
		System.out.println(testStr3.matches(regex));
	}

}
