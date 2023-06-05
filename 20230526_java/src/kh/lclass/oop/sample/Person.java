package kh.lclass.oop.sample;

import java.io.Serializable;

public class Person implements Serializable{
	
	/***
	 * 파랑주석
	 * java docs 에 표시
	 * 여기에 uid 생성날짜, 누가, 무엇 때문에 작성했는지 남겨야함.
	 */
	private static final long serialVersionUID = -101778373168041641L;
	private String name; // 주민등록상 이름
	private int age;
	private transient char gender;
	
	
	
	/**파랑색 작성위치 여기*/
	public Person() {

	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;

	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
