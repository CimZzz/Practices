package designpattern.creational.builder;

/**
 * 复杂产品，拥有PartA、PartB、PartC
 * @author CimZzz
 *
 */
public class ComplexProduct {
	PartA partA;
	PartB partB;
	PartC partC;
	
	
	public String description()
	{
		return "ComplexProduct contains:"+partA.description()+","+partB.description()+","+partC.description();
	}
}
