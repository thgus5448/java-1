package Protect2;
import package1.A;

/* protect 접근 제한자 테스트1
 * 접근 불가능한 이유 : protect접근제한자는 패키지가 다르면 자식 클래스만 접근을 허용한다.
 */

public class C {
	public void method() {
		A.a = new A();	// 접근 불가
		a.field = "value";	//접근 불가
		a.method();	//접근 불가
	}
}
