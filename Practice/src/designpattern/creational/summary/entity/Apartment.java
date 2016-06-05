package designpattern.creational.summary.entity;

/**
 * 公寓，继承了虚基类House
 * @author CimZzz
 *
 */
public class Apartment extends House {

	@Override
	public String description() {
		return "An apartment";
	}

	@Override
	public House Clone() {
		House house = null;
		try {
			house = (House) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return house;
	}

}
