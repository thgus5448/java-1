package TypeChange_auto;

/* 자동 타입 변환
 * 메소드를 호출할 때는 매개 변수의 타입과 동일한 매개값을 지정하는 것이 정석.
 * but 매개값을 다양화 하기 위해 매개 변수에 자식 타입 객체를 지정할 수도 있음
 * 
 * 언제 사용?
 * 1. 필드의 값을 대입할 때
 * 2. 메소드를 호출할 때(주로 사용)
 */

// Vehicle 클래스
public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
