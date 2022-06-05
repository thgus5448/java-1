package ProtectionExample;

//실행 클래스
public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); //Car 객체 생성
		
		for(int i=1; i<=5; i++) {	// Car 객체의 run() 메소드 5번 반복 실행
			int problemLocation = car.run();
			
			switch(problemLocation) {
			//앞왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
			case 1 :
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			//앞오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체	
			case 2 :
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new KumhoTire("앞왼쪽", 13);
				break;
			//뒤왼쪽 타이어가 펑크 났을 때 HankookTire로 교체	
			case 3 :	
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			//뒤오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체	
			case 4 :
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("----------------------------------"); //1회전시 출력되는 내용을 구분
		}
	}
}
