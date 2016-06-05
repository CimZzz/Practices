package classes;

import java.lang.reflect.Field;

/**
 * 测试：
 * 1.int等基本类型是否为Object的子类
 * 结果：
 * 1.发生异常，判断int等基本类型不是Object的子类
 * @author CimZzz
 *
 */
public class FieldType {
	public int i;
	public Float[] f;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Field[] fields = FieldType.class.getDeclaredFields();
		
		for(Field field : fields)
		{
			System.out.println("Field Name : "+ field.getName());
			Class cls = field.getType();
			
			System.out.println("Field Type : "+ cls);
			System.out.println("Field Type Is Array : "+ cls.isArray());
			
			System.out.println("-------------------------------");
		}
	}
}
