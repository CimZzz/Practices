package designpattern.creational.summary.entity;

/**
 * 河流，实现了克隆方法
 * @author CimZzz
 *
 */
public class River implements Cloneable{
	
	public River Clone()
	{
		River river = null;
		
		try {
			river = (River) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return river;
	}
}
