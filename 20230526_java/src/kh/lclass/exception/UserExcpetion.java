package kh.lclass.exception;

public class UserExcpetion extends Throwable{
	public UserExcpetion() {
		super("유저익셉션 메시지");
	}
	public UserExcpetion(String msg) {
		super(msg);
	}
}
