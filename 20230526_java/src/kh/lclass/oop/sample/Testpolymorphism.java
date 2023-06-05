package kh.lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Testpolymorphism {
	public static void main(String[] args) {

		ArrayList<Car> carArrList   = new ArrayList<Car>();
		List<Car> carList 			= new ArrayList<Car>();     //가장 흔하게 선언하는 방식; 
		List<Car> carList2 			= new ArrayList<Car>();     //가장 흔하게 선언하는 방식; 
		Collection<Car> carCollection = new ArrayList<Car>();
		
		
		
		
		Driver ej = new Driver();
		ej.setMoney(10000);
		ej.buy(new Sonata());
		ej.buy(new Avante());
	} 
}
