package TypeChange_Casting;

/* 강제 타입 변환(Casting)
 * 부모 타입을 자식 타입으로 변환하는 것
 * but 모든 부모 타입을 자식 클래스 타입으로 강제 변환할 수 있는 것은 아님.
 * 
 * 그럼 언제 사용 가능한가?
 * 자식 타입이 부모타입으로 자동 변환한 후, 다시 자식 타입으로 변환할 때 강제 타입 면환을 사용할 수 있다.
 * 
 * 자식 타입이 부모 타입으로 자동 변환시 제약이 따름 : 부모 타입에 선언된 필드와 메소드만 사용 가능.
 * ㄴ 만약 자식 타입에 선언된 필드와 메소드를 꼭 사용해야 한다면?
 * 강제 타입 변환을 해서 다시 자식 타입으로 변환 후 다시 자식 타입의 필드와 메소드를 사용하면 됨.
 */

//부모 클래스
public class Parent {
	public String field1;
	
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
}
