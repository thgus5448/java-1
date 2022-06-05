package Airplan;

//부모 메소드 호출(Super변수)
public class SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		//이륙
		sa.takeOff();
		
		//비행중 비행모드 알림
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		
		//착륙 알림
		sa.land();
	}
}
