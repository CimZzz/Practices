package statement;

/**
 * 用来测试lambda表达式能否用于多个方法的接口
 * 结论：The target type of this expression must be a functional interface 这个表达式的目标类型必须是一个功能接口
 * @author CimZzz
 *
 */
public class Lamda_MoreParams {

	public interface SingleMethod{
		void OnlyOne();
	}

	public interface MultipleMethod{
		void One();
		void Two();
	}
	
	
	public static void main(String[] args) {
		SingleMethod singleMethod=()->{System.out.println("OnlyOneMethods");};
		
		singleMethod.OnlyOne();
		
		//MultipleMethod multipleMethod=()->{System.out.println("OnlyOneMethods");} error
	}

}

class kk{
	public kk(int i)
	{
		
	}
}
