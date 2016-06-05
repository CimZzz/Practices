package statement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lambda表达式的ForEach测试
 * @author CimZzz
 *
 */
public class Lambda_Foreach {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(new Integer[]{1,2,3,4,5,6});
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		
		list.forEach(e->System.out.println(e));
	}

}
