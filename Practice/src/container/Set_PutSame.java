package container;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试存放同一个元素
 * Set保证元素单一
 * 
 * 测试存放同一个值的元素
 * @author CimZzz
 *
 */
public class Set_PutSame {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		set.add("11");
		set.add("22");
		set.add("11");
		
		System.out.println(set);
	}

}
