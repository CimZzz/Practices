package designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 晚餐作为产品，其中包括若干的水果与食物
 * @author CimZzz
 *
 */
public class Dinner {
	private List<Fruit> fruits;
	private List<Vegetable> vegetables;
	
	Dinner() {
		fruits = new ArrayList<>();
		vegetables = new ArrayList<>();
	}
	
	public void addFruit(Fruit fruit)
	{
		fruits.add(fruit);
	}
	
	public void addVegetable(Vegetable vegetable)
	{
		vegetables.add(vegetable);
	}
	
	public void printDinner()
	{
		System.out.println("Dinner Contains:");

		for(Fruit fruit : fruits)
		{
			System.out.println(fruit.description());
		}

		for(Vegetable vegetable : vegetables)
		{
			System.out.println(vegetable.description());
		}
		
		System.out.println("--------------------------");
	}
	
	public Dinner Clone()
	{
		Dinner dinner = new Dinner();
		dinner.fruits = new ArrayList<>(fruits);
		dinner.vegetables = new ArrayList<>(vegetables);
		
		return dinner;
	}
}
