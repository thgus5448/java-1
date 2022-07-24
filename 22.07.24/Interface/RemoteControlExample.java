package Interface;

//인터페이스 사용
public class RemoteControlExample {
	
	/* 인터페이스 변수에 구현 객체 대입
	 * 
	 * 잘못된 구현 방법
	 * Television tv = new Television;
	 * 
	 * 구현방법1
	 * 인터페이스 변수;
	 * 변수 = 구현객체
	 * 
	 * 구현방법2
	 * 인터페이스 변수 = 구현객체;
	 */
	public static void main(String[] args) {
		
		//인터페이스의 변수 선언
		RemoteControl rc = null;
		
		//Television 객체를 인터페이스 타입에 대입
		rc = new Television();
		//인터페이스의 turnOn(), turnOff() 호출
		rc.turnOn();
		rc.turnOff(); 
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
