package kh.lclass.oop.sample;

public class Student extends Person{
	private String name; //학생증용 이름
//	private int age;
//	private char gender;
	private int score;
	private int grade;
	
	
	
	public Student() {
		super("김개똥", 22, '남');
	}
	
	public Student(String name, char gender, int age, int grade) {
		super(name, age, gender);
		this.name=name;
		this.grade=grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade 
				+ ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public String getName() {
		return name;  //본명
		
	}
	@Override 
	// override 재정의 - 
	//조건 : 상속한 클래스의 메소드와 동일한 메소드명
	// 매개변수 자료형, 개수, 리턴타입 동일
	//제약조건은 달라도 됨 - 부모메소드의 접근 제한자보다 넓은 범위접근 제한자여야함.
	public int getAge() {
		return super.getAge()+1;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

