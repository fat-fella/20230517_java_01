package kh.lclass.oop.sample;

import java.awt.im.spi.InputMethod;
import java.io.Serializable;
import java.util.Collection;

public interface TestInterface extends InputMethod, Serializable {
	public void method1();  //능력단위별 평가보기
	public String method2(); // 평가안내
	public int method3(int a, int b); //평가리뷰
}
