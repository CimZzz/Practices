package designpattern.creational.summary.builder;

import designpattern.creational.summary.entity.Apartment;
import designpattern.creational.summary.entity.BigTree;
import designpattern.creational.summary.entity.River;
import designpattern.creational.summary.entity.SmallTree;
import designpattern.creational.summary.entity.Villa;

public class CityBuilder extends Builder {
	@Override
	public void buildHouse(int mask) {
		city.addHouse(mask == APARTMENT ? new Apartment() : new Villa());
	}
	
	@Override
	public void buildRiver() {
		city.addRiver(new River());
	}
	
	@Override
	public void buildTree(int mask,int age) {
		city.addTree(mask == BIG_TREE ? new BigTree(age) : new SmallTree(age));
	}
}
