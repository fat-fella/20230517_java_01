package kh.lclass.api;

public class JhCommonApi {
	public static boolean checkMenu(int start, int end, int value) {
		boolean result = false;
		if (value < start || value > end) {
			System.out.printf("%d~%d 선택.\n",start, end);
		} else {
			result=true;
		}
		
		return result;
	}
}
