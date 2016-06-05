package designpattern.creational.summary.entity;

import java.util.ArrayList;
import java.util.List;

public class City implements Cloneable{
	private static int CityNumber = 0;
	
	
	private int number;
	
	private List<Tree> trees;
	private List<House> houses;
	private List<River> rivers;
	
	public City()
	{
		trees = new ArrayList<>();
		houses = new ArrayList<>();
		rivers = new ArrayList<>();
		
		number = CityNumber ++ ;
	}
	
	public void addTree(Tree tree)
	{
		trees.add(tree);
	}
	
	public void addHouse(House house)
	{
		houses.add(house);
	}
	
	public void addRiver(River river)
	{
		rivers.add(river);
	}
	
	public City Clone()
	{
		City city = null;
		
		try {
			city = (City) clone();
			
			city.number = CityNumber++;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return city;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("City Number:");
		buffer.append(number);
		buffer.append("---------\n");
		
		buffer.append("其中有树木").append(trees.size()).append("棵，");
		buffer.append("有房屋").append(houses.size()).append("栋，");
		buffer.append("有河流").append(rivers.size()).append("条\n");
		
		trees.forEach(e->{
			buffer.append(e.description());
			buffer.append("\n");
		});
		
		houses.forEach(e->{
			buffer.append(e.description());
			buffer.append("\n");
		});
		
		return buffer.toString();
	}
}
