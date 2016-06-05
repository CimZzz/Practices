package designpattern.creational.summary.entity;

/**
 * 房屋的基类，提供了自我描述方法和克隆方法
 * @author CimZzz
 *
 */
public abstract class House implements Cloneable{
	
	public abstract String description();
	
	public abstract House Clone();
}
