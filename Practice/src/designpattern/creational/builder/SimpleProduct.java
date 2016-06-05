package designpattern.creational.builder;

/**
 * 简单产品，拥有PartA
 * @author CimZzz
 *
 */
public class SimpleProduct {
	PartA partA;
	
	
	public String description()
	{
		return "SimpleProduct contains:"+partA.description();
	}
}
