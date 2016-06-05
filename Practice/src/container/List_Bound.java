package container;

import java.util.ArrayList;
import java.util.List;

/**
 * 用List来测试泛型的边界限定
 * 结果：
 * @author CimZzz
 *
 */
public class List_Bound {

	public static void main(String[] args) {
		Base base=new Base();
		Child child=new Child();
		GrandChild grandChild=new GrandChild();

		List1<Base> list1=new List1<>();

		list1.add(base);
		list1.add(child);
		list1.add(grandChild);

		List2 list2=new List2<>();

		list2.add(base);
		list2.add(child);
		list2.add(grandChild);
		

		List3 list3=new List3<>();

		list3.add(base);
		list3.add(child);
		list3.add(grandChild);
		
	}

}

class List1<E> extends ArrayList<E>{
	
}

class List2<Base> extends ArrayList<Base>{
	
}

class List3<T extends Base> extends ArrayList<T>{
	
}


class Base{
	
}

class Child extends Base{
	
}

class GrandChild extends Child{
	
}