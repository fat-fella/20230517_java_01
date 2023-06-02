package kh.lcass.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import kh.lclass.oop.sample.Car;

public class TestCollection {
	
	public<E> String testGeneric(E a) {
		return a.toString() + "결과값";
	}
	
	
	
	public void testStack() {
		Stack<String> strStack = new Stack<String>();
		strStack.push("안녕");
		strStack.add("하");
		strStack.push("세요");
		System.out.println(strStack.get(1));
		System.out.println(strStack);
		System.out.println(strStack.peek());
		System.out.println(strStack);
		System.out.println(strStack.pop());
		System.out.println(strStack);
	}
	
	
	
	
	public void testHashSet() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(11);
		System.out.println(integerSet.toString());
		System.out.println("enhanced");
		for(int item : integerSet) {
			System.out.println(item);
		}
		System.out.println("iterator");
		Iterator<Integer> itr = integerSet.iterator();
		System.out.println(itr);
		while (itr.hasNext()) {
			Integer item = itr.next();
			System.out.println(item);
		}
		
		
		
		
	}
	public void testArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Car> list3 = new ArrayList<Car>();
		list3.add(new Car(3000));
		
		
		list.add("2번");
		list.add("1번");
		list.add(null);
		list.add("2번");
		list.add("3번");
		list.add(1, "2번대신끼워넣기");
//		list.remove("2번");
		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("2번");
		collection1.add("3번");
		list.removeAll(collection1);
		list.clone();
//		list.remove(0);
//		list.clear();
		System.out.println(list);
		for (int i=0; i < list.size();i++) {
			String item = list.get(i);
			System.out.println(list.get(i));
		}
		System.out.println("===enhanced for===");
		//enhanced for
		for (String item : list) {
			System.out.println(item);
		}
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
	}
	public void testHashSet1() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(11);
		System.out.println(integerSet.toString());

		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
