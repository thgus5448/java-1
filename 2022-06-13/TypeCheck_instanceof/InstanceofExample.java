package TypeCheck_instanceof;

public class InstanceofExample {
	
	//메소드1 : instanceof 연산자로 변환이 가능한지 확인 후 변환
	public static void method1(Parent parent) {
		if(parent instanceof Child) {	//instanceof : parent가 Child 타입으로 변환이 가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음.");
		}
	}
	
	//메소드2 : 확인하지 않고 그냥 변환
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child로 변환 성공");	//ClassCastException이 발생할 가능성 있음
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		//Child 객체를 매개값으로 전달 = 두 메소드 모드 예외가 발생하지 않는다.
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		/* Parent 객체를 매개갑으로 전달 = method2에서는 ClassCastExciption이 발생
		 *							왜? method1 : instanceof 연산자로 변환이 가능한지 확인한 후 변환. 예외 발생시 프로그램 즉시 종료
		 *							   method2 : 무조건 변환하려고 함
		 */
		method1(parentB);
		method2(parentB);	//예외발생
	}
}
