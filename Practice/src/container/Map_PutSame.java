package container;

import java.util.HashMap;
import java.util.Map;

/**
 * 存放Key相同，值不同的元素
 * 结果为后放入的会覆盖掉前一个
 * @author CimZzz
 *
 */
public class Map_PutSame {
	public static void main(String[] args)
	{
		Map<String,Integer> map=new HashMap<String,Integer>();

		map.put("1", 1);
		map.put("2", 1);
		map.put("1", 2);
		
		System.out.println(map);
	}
}
