package kh.lclass.thread.run;


import kh.lclass.thread.ThreadAaa;
import kh.lclass.thread.ThreadBbb;

public class Run {
	
	public static void main(String[] args) {
		Thread ta = new Thread(new ThreadAaa());
		ta.setPriority(1);
		ta.start();
		
		Thread tb = new ThreadBbb();
		tb.setPriority(10);
		tb.start();
		
		
		Thread tbb = new ThreadBbb();
		tbb.start();
		
		
		for (int i = 0 ; i<500 ; i++) {
				System.out.println(i+"*");
			}
			System.out.println("===main 끝");
		}
	
	}


