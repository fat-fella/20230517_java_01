package kh.lclass.oop.sample;

import java.awt.AWTEvent;
import java.awt.Rectangle;
import java.awt.im.spi.InputMethodContext;
import java.io.Serializable;
import java.lang.Character.Subset;
import java.util.Locale;

@SuppressWarnings("serial")
public class Kh implements TestInterface, Serializable{
	public void khSpecial() {
		String str = "1111122221111122222222222222";
		try {
			Car[] carArr = new Car[3];
			carArr[4].setPrice(5000);
			carArr[0].setPrice(5000); //NullPointerException
			
			int a = Integer.parseInt(str);
			
		} catch (NullPointerException e) {
			System.out.println("merong");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("merong~");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int method3(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setInputMethodContext(InputMethodContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean setLocale(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setCharacterSubsets(Subset[] subsets) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCompositionEnabled(boolean enable) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isCompositionEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void reconvert() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispatchEvent(AWTEvent event) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyClientWindowChange(Rectangle bounds) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deactivate(boolean isTemporary) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hideWindows() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeNotify() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void endComposition() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object getControlObject() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
