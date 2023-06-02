package kh.lcass.collection;

import kh.lclass.oop.sample.Car;

public class Main {

	public static void main(String[] args) {
//		new TestCollection().testArrayList();
//		new TestCollection().testHashSet();
//		new TestCollection().testStack();
		TestCollection tc = new TestCollection(); 
		String str = tc.testGeneric(35.5);
		System.out.println(str);
		str = tc.testGeneric("안녕");
		System.out.println(str);
		str = tc.testGeneric(new Car(300));
		System.out.println(str);
	}

}
