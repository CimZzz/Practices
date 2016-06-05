package designpattern.creational.virtualconstructor;

/**
 * 通过泛型模板的工厂方法来创建产品
 * 由于Java擦除的缘故，不能直接用类型来实例化对象，只能借助 Class 来创建对象
 * @author CimZzz
 *
 * @param <T>
 */
public class ProductFactoryD{
	public <E extends Product> E createProduct(Class<E> cls) throws InstantiationException, IllegalAccessException
	{
		return cls.newInstance();
	}
}
