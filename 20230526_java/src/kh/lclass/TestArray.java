package kh.lclass;

import java.util.Arrays;

import kh.lclass.oop.sample.Student;

public class TestArray {
	public static void main(String[] args) {
		String[] strArr = new String[3]; //배열 생성/선언
		strArr[0] = "apple";
		strArr[1] = "banana";
		strArr[2] = new String("mango");
		
		
		
		//strArr를 복사할 strCopyArr 생성
		String[] strCopyArr= new String[strArr.length];
		for(int i = 0 ; i<strArr.length ; i++) {
			strCopyArr[i] = strArr[1];
		}
		strArr[2] = "orange";
		strCopyArr[1] = "딸기";
		for(int i = 0 ; i < strArr.length; i++) {
			System.out.println(strArr[1] + " : " + strCopyArr[i]);
			
		}
		System.out.println("=================");
		
//		int a = 10; 는 a. 안됨
		int[] arrA = new int [3];
		arrA[2] = 20;
		int[] arrB = arrA.clone();
		System.out.println(arrB.length);
		System.out.println(arrB[2]);
		
		Arrays.copyOf(strArr, 3);

		String[] strCopyArr2 = Arrays.copyOf(strArr, 3 );
		System.out.println(strArr.length);
		for(int i=0 ; i<strCopyArr2.length ; i++) {
			System.out.println(strCopyArr2[i]);
		}
		
		System.out.println("====system===");
		String[] strCopyArr3 = new String[5];
		System.arraycopy(strArr, 1, strCopyArr3, 0, 2);
		for(int i =0; i<strCopyArr3.length ; i++) {
			System.out.println(strCopyArr3[i]);
		}
		
		
		
		
		String[] strArr2 = {"apple", "banana", new String("mango")};
		String[] strArr3 = {new String("apple"), new String("banana"), new String("mango")};
		String[] strArr4 = new String[] {"apple", "banana", new String("mango")};
		String[] strArr5 = new String[] {new String("apple"), new String("banana"), new String("mango")};
		System.out.println("strArr의 0번째 과일은 "+ strArr[0]);
		System.out.println("strArr의 1번째 과일은 "+ strArr[1]);
		System.out.println("strArr의 2번째 과일은 "+ strArr[2]);
		for(int i = 0; i<strArr.length; i++) { //조건문에 실수 줄이기 위해 .length 사용
			System.out.println("strArr의" + i + "번째 과일은 "+ strArr[i]);
			System.out.printf("strArr의 %d번째 과일은 %s\n", i ,  strArr[i]);
			
		}
		
		
		
		
		
		
		
		
//		System.out.println(strArr[0]);
		
		int[] intArr = new int[3];
		System.out.println(intArr[1]);
		
		int[] intArr2 = new int[] {1,2,3}; // 2차원 배열에서 필요
		int[] intArr3 = {1,2,3};
		
		
		
		
//		Student[] StudentArr = new 
	}

}
