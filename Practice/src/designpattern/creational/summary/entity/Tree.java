package designpattern.creational.summary.entity;

/**
 * 树的基类，提供了自我描述方法和克隆方法
 * @author CimZzz
 *
 */
public abstract class Tree implements Cloneable{
	private int age;
	
	public Tree(int age)
	{
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract String description();
	
	public abstract Tree Clone();
}
