package basetype;

import java.io.File;
import java.net.URL;

import org.omg.CORBA.Environment;

/**
 * 测试运算符的使用的使用
 * 1.循环100次的m=m++,m仍为0
 * 2.a+=b+=a+=b+=6,执行之后a=38,b=27
 * @author CimZzz
 *
 */
public class Operator {

	public static void main(String[] args) {
		int m=0;
		
		for(int i=0;i<100;i++)
			m=m++;
		
		System.out.println("m=m++,执行100次之后m为:"+m);
		
		int a=10,b=0;
		
		a+=b+=a+=b+=6;
		/*反汇编字节码
		 *     0: bipush        11
		       2: istore_1
		       3: iconst_5
		       4: istore_2
		       5: iload_1
		       6: iload_2
		       7: iload_1
		       8: iinc          2, 6
		      11: iload_2
		      12: iadd
		      13: dup
		      14: istore_1
		      15: iadd
		      16: dup
		      17: istore_2
		      18: iadd
		      19: istore_1
		 * */
		
		System.out.println("a+=b+=a+=b+=6,执行之后a为:"+a+",b为:"+b);
		
		String url=Operator.class.getResource("Operator.class").getPath();
		
		File file=new File(url);

		System.out.println(file.exists());
		System.out.println(url);
	}

}
