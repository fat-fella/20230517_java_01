package kh.lclass.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIO {
	public void testFile() /* throws IOException */ {
//		File f1 = new File("D:/data1/aaa.txt");
//		f1.mkdirs();
		String path = "D:/data2/test";
		String filename = "aaa.txt";
		FileWriter fw = null;

		new File(path).mkdirs();
		File f2 = new File(path, filename);

		try {
			f2.createNewFile();

			fw = new FileWriter(f2);
			fw.write("abcdefg");
			fw.flush();
			return;
		} catch (IOException e) {
			System.out.println("cannot create file");
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
