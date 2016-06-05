package designpattern.creational.builder;

/**
 * 普通产品，拥有PartA、PartB
 * @author CimZzz
 *
 */
public class CommonProduct {
	PartA partA;
	PartB partB;
	
	
	public String description()
	{
		return "CommonProduct contains:"+partA.description()+","+partB.description();
	}
}
