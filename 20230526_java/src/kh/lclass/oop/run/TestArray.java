package kh.lclass.oop.run;

import kh.lclass.oop.sample.Person;
import kh.lclass.oop.sample.Student;

public class TestArray {
	public static void main(String[] args) {
		Person[] personArray = new Person[22];    //heap 에 4바이트짜리 주소를 담을 수 있는 22개짜리 공간 마련;
		Person[] personArray2 = new Person[]{new Person(), new Person()};
		for(int i = 0; i<personArray.length ; i++) {
			personArray[i] = new Person();
		}
		
		//아래와 같이 하면 오류발생 
		Person[] personArray3 = new Person[22];
//		personArray3[0].setAge(25);
		//NullPointException 
		// 원인:  .점 앞에 있는 변수 (객체=인스턴스)가 null 상태(personArray[0]);
		// 해결방법 : personArray[0]에 new 생성자(); 해줌 
		personArray3[0] = new Person();     // heap 에 person모양 (age, name, gender)를 넣어줌;
		personArray3[0].setAge(25);
		personArray3[0].setName("김소똥");
		personArray3[0].setGender('남');
		personArray3[1] = new Person("김개똥", 19, '남'); 
		personArray3[2] = new Person("김말똥", 22, '남');
		
		Student [] stdArray = new Student[3];
		for(int i=0; i<stdArray.length; i++) {
			stdArray[i] = new Student();
		}
		stdArray[0].setAge(15);
		stdArray[0].setName("김영희");
		stdArray[0].setGender('여');
		stdArray[0].setScore(85);
		stdArray[0].setGrade(3);
		System.out.println(stdArray[0].getName());
		System.out.println(stdArray[0].getAge());
		System.out.println(stdArray[0].getGender());
		System.out.println(stdArray[0].toString());
		
		
		Student yh = new Student("김영희", '여', 20, 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

