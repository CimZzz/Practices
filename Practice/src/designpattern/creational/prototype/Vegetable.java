package designpattern.creational.prototype;

/**
 * 蔬菜接口，提供了自我描述方法和克隆方法
 * @author CimZzz
 *
 */
public interface Vegetable extends Cloneable {
	String description();
	
	Vegetable Clone();
}

/**
 * 番茄，实现了Vegetable接口
 * @author CimZzz
 *
 */
class Tomato implements Vegetable{

	@Override
	public String description() {
		return "Vegetable : Tomato";
	}
	
	@Override
	public Vegetable Clone() {
		try {
			return (Vegetable) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}

/**
 * 土豆，实现了Vegetable接口
 * @author CimZzz
 *
 */
class Potato implements Vegetable{
	@Override
	public String description() {
		return "Vegetable : Potato";
	}
	
	@Override
	public Vegetable Clone() {
		try {
			return (Vegetable) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
