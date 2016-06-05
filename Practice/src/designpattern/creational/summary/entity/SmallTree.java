package designpattern.creational.summary.entity;

/**
 * 小树，继承了虚基类Tree
 * @author CimZzz
 *
 */
public class SmallTree extends Tree {

	public SmallTree(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		return "Small Tree Age : " +  getAge();
	}

	@Override
	public Tree Clone() {
		Tree tree = null;
		try {
			tree = (Tree) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tree;
	}

}
