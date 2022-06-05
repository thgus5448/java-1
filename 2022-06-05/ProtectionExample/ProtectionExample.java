package ProtectionExample;

/* 자동 타입 변환
 * 부모 타입으로 자동 변환된 이후 : 부모 클래스에 선언된 필드와 메소드만 접근 가능.
 * 예외) 메소드가 자식 클래스에서 오버라이딩되었다면 자식 클래스의 메소드가 대신 호출.
 * 
 * 왜 자동타입 변환이 필요한가? 
 * 그냥 자식 타입으로 사용하면 될 것을 부모 타입으로 변환해서 사용하는 이유가 무엇인가.
 * = 프로그램은 수많은 객체들이 서로 연결되고 각자의 역할을 하게된다. 
 * 	 이 객체들은 다른 객체로 교체될 수 있어야 한다.
 * 예) 자동차 클래스를 처음 설계할 때 사용한 타이어 객체는 언제든지 성능이 좋은 다른 타이어 객체로 교체할 수 
 * 있어야 한다.
 * 새로 교체되는 타이어 객체 : 기존 타이어와 사용 방법은 동일하지만 실행 결과는 더 우수하게 나와야 할 것임.
 */
class A {}

class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class ProtectionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//컴파일 에러 - 상속 관계에 있지 않다.
		//B b3 = d;
		//C c2 = d;
	}
}
