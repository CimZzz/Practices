package designpattern.creational.summary.entity;

/**
 * 大树，继承了虚基类Tree
 * @author CimZzz
 *
 */
public class BigTree extends Tree {
	public BigTree(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		return "Big Tree Age : " +  getAge();
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
