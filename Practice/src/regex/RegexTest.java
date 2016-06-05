package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的验证,等号前半部分为词字符,后半部分为任意字符和换行
 * @author CimZzz
 *
 */
public class RegexTest {
	private static final String REGEX="[$]{2}";
	private static final String STR="id=2\turl=http:sss$$title=好消息$$content=力神被宝忠炸了！$$imgurl=http:sd$$$$date=1994-9-8$$";
	

	public static void main(String[] args) {
		for(String str:STR.split(REGEX))
			if(!"".equals(str))
			System.out.println(str);
	}

}
