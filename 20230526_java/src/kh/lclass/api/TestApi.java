package kh.lclass.api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

import lclass.vo.TestVo;
import static kh.lclass.api.JhCommonApi.*;

public class TestApi {
	
	public void testDate() {
		Date when = new Date(1000*60*60L);
		// most are deprecated
		System.out.println(when);
		//calendar - new 못함
		//해결 1
		Calendar c = new GregorianCalendar();
		//해결 2   singleton = 디자인패턴 중 하나 
		Calendar c2 = Calendar.getInstance();
		
		TestSingleton ts = TestSingleton.getInstance();
		System.out.println(ts.getA());
		ts.setA(50);
		System.out.println(ts.getA());

		TestSingleton ts2 = TestSingleton.getInstance();
		System.out.println(ts2.getA());
		ts2.setA(100);
		System.out.println(ts2.getA());
		
		
		
		System.out.println(c.getTime());
	}
	
	
	
	
	
	
	public void testWrapperWhile() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("메뉴1~5 사이 선택 : ");
			int menu = 0;
			try {
				String menuStr = sc.nextLine();
				menu = Integer.parseInt(menuStr);
			} catch (InputMismatchException e) {}

			if (!checkMenu(1, 5, menu)) {
				continue;
			}
			System.out.println("정상");
			testString();
			System.out.println("동작끝");
			break;
		}

//		while(true) {		
//			System.out.print("메뉴1~5 사이 선택 : ");
//			int menu = 0;
//			try {
//				menu = sc.nextInt();
//			} catch (InputMismatchException e) {
//				sc.nextLine();
//			}
//		
//			if (menu < 1 || menu > 5) {
//				System.out.println("1~5선택");
//				continue;
//			}
//			System.out.println("정상");
//			testString();
//			System.out.println("동작끝");
//			break;
//		}

//		while(true) {
//			System.out.print("메뉴1~5 사이 선택 : ");
//			int menu = sc.nextInt();
//		
//			if (menu >0 && menu < 6) {
//				//정상
//				System.out.println("정상~~~ 다른 함수 호출.");
//				testString();
//				System.out.println("동작끝~!");
//				break;
//			} else {
//				//비정상
//				System.out.println("1~5 선택");
//			}
//		}
		System.out.println("testwrapperdowhile끝");
	}

	public void testString() {
		StringBuffer str1 = new StringBuffer("aaa");
		StringBuffer str2 = new StringBuffer();
		str2.append("12345");
		str2.insert(2, "abc");
		System.out.println(str2);
		System.out.println(str2.indexOf("bc"));
		StringBuilder str3 = new StringBuilder("bbb");
		str3.insert(1, "111");

		String str = "AA|BB|CC";
		StringTokenizer st = new StringTokenizer(str, "|");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st);

		// 기본 자료형 --> String;
		int i = 35;
		double d = 35.0;
		String s1 = String.valueOf(35);
		String s2 = Integer.valueOf(35).toString();
		String s3 = Double.valueOf(d).toString();

		// String --> 기본자료형
		String s = "35";
		i = Integer.parseInt(s);
		System.out.println(i);

		int bnum1 = 10;
		int bnum2 = 11;
//		String bcontent = "aaaa";
		String bwriter1 = "aa";
		bwriter1 = "bb";

//		TestVo tvo = new TestVo(10,"aa");

//		TestVo tvo2 = new TestVo(11);
	}
}
