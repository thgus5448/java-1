package Airplan;

// 부모 메소드 호출(Super변수)
public class Airplan {
	
	public void land() { //착륙 알림
		System.out.println("착륙합니다.");
	}
	
	public void fly() { //비행중 현재 비행모드 알림
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {	//이륙 알림
		System.out.println("이륙합니다.");
	}
}
