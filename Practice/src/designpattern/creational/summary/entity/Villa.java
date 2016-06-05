package designpattern.creational.summary.entity;

/**
 * 别墅，继承了虚基类House
 * @author CimZzz
 *
 */
public class Villa extends House {

	@Override
	public String description() {
		return "A villa";
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
