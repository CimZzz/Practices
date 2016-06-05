package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 测试辅助注释的一般用法
 * @Retention 选择编译时期
 * @Target 选择注释位置
 * @author CimZzz
 *
 */
public class NormalAnnatation {
	public static void main(String[] args) throws Exception {
		
		System.out.println(Class1.class.getConstructor().getAnnotation(Constructor.class).transition());
		System.out.println(Class2.class.getConstructor().getAnnotation(Constructor.class).transition());
	}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor{
	String transition() default "无注释";
}





class Class1{
	
	@Constructor(transition="Class1的构造函数")
	public Class1(){
		
	}
}

class Class2{
	
	@Constructor
	public Class2(){
		
	}
}