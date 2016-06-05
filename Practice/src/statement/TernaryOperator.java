package statement;

/**
 * 测试：三元运算符允许的操作
 * 结果：三元运算符必须为有返回值并且拥有赋值符号"="，三元运算符支持多条件判断
 * @author CimZzz
 *
 */
public class TernaryOperator {

	private static int fun1()
	{
		System.out.println("fun1");
		return 0;
	}
	private static int fun2()
	{
		System.out.println("fun2");
		return 0;
	}

	public static void main(String[] args) {
		int i = 1;
		i = i > 1 && 2 > i ? fun1() : fun2();
	}

}
