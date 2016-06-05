package designpattern.creational.prototype;

/**
 * 水果接口，提供了自我描述方法和克隆方法
 * @author CimZzz
 *
 */
public interface Fruit extends Cloneable{
	String description();
	
	Fruit Clone();
}

/**
 * 苹果，实现了Fruit接口
 * @author CimZzz
 *
 */
class Apple implements Fruit{

	@Override
	public String description() {
		return "Fruit : Apple";
	}

	@Override
	public Fruit Clone() {
		try {
			return (Fruit) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}

/**
 * 香蕉，实现了Fruit接口
 * @author CimZzz
 *
 */
class Banana implements Fruit{

	@Override
	public String description() {
		return "Fruit : Banana";
	}

	@Override
	public Fruit Clone() {
		try {
			return (Fruit) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}