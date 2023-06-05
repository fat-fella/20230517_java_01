package kh.lclass.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kh.lclass.exception.UserExcpetion;
import kh.lclass.oop.sample.Person;

public class TestFileIO {
	public void testFileOutputStreamObject() {
		//파일에 사람들 자료를 저장함.
		Person p1 = new Person("홍길동", 23, '남');
		Person p2 = new Person("영희", 27, 'F');

		String filepath = "D:/data2/test/aaa.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filepath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)	oos.close();
				if (fos != null)	fos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void testFileInputStreamObject() {
		String filepath = "D:/data2/test/aaa.txt";
		FileInputStream ios = null;
		ObjectInputStream ois = null;
		try {
			ios = new FileInputStream(filepath);
			ois = new ObjectInputStream(ios);
			Person a = (Person)ois.readObject();
			Person b = (Person)ois.readObject();
			System.out.println(a);
			System.out.println(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)	ois.close();
				if (ios != null)	ios.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void testRamda() throws UserExcpetion {
		int[] arr = { 2, 3, 4 };
		int[] arr2 = new int[] { 2, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		if (arr.length > 2) {
			throw new UserExcpetion("메롱");

		}

	}

	public void testFileReadData() {
		String filepath = "D:/data2/test/aaa.txt";
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filepath));) {
			long temp = 0L;
			while ((temp = dis.readLong()) != 0) {
				System.out.println(String.valueOf(temp));
			}

			// F2 - quick fix 사용 1. try catch 신중하게 잘 써야함. 2. unimplemented method add
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void testFileRead3() {
		String filepath = "D:/data2/test/aaa.txt";

		try (FileInputStream fis = new FileInputStream(filepath);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);) {

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
//		} finally {
//			try {
//				if(br != null) br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}

	}

	public void testFileRead2() {
		String filepath = "D:/data2/test/aaa.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 생성 순서: 기반스트림 --> 보조스트림
			fis = new FileInputStream(filepath);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			// 줄여서 나타내기

//			isr = new InputStreamReader(new FileInputStream(filepath));
//			br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)));

			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 해제 순서 (역순) : 보조스트림 --> 기반스트림
				if (br != null)
					br.close();
				if (fis != null)
					fis.close();
				if (isr != null)
					isr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	public void testFileRead() {
		String filepath = "D:/data2/test/aaa.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(filepath); // resource 통로
			/*
			 * int a = -1; 방법1 while((a = fr.read()) > -1) { System.out.println((char)a); }
			 */

			// 방법2
			int cntPerRead = 30;
			char[] readCharArr = new char[900];
			for (int i = 0; i < readCharArr.length / cntPerRead; i++) {

				int readCnt = fr.read(readCharArr, i * cntPerRead, cntPerRead);
				System.out.println(readCnt);
				if (readCnt < cntPerRead) {
					break;
				}
			}
			System.out.println(readCharArr);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없음. 경로확인");
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("testFileRead 끝");
		}
	}

	public void testFile() /* throws IOException */ {
//		File f1 = new File("D:/data1/aaa.txt");
//		f1.mkdirs();
		String path = "D:/data2/test";
		String filename = "aaa.txt";
		FileWriter fw = null;

		new File(path).mkdirs(); // 디렉토리 생성
		File f2 = new File(path, filename);

		try {
			f2.createNewFile(); // 파일생성

			fw = new FileWriter(f2); // File에 문자 형태 전송이 가능한 OutputStrea ( file과 java 프로그램의 통로)
			fw.write("abcdefg"); // 전송할 문자
			fw.flush(); // 전송할 문자가 담긴 버퍼(통로)를 깨끗하게 밀어내기
			return;
		} catch (IOException e) {
			System.out.println("cannot create file");
			e.printStackTrace();
		} finally { // return 전에 반드시 실행하고 넘어가는 문구
			try {
				if (fw != null)
					fw.close(); // 통로 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
