package Protect2;
import Protect1.A;

/*	protected 접근 제한자 테스트2
 * 	접근 가능한 이유 : protected 접근 제한자는 패키지가 다를 경우 자식 클래스의 접근만 허용한다.
 *  = D 클래스는 A로부터 extends(상속)받았기 때문에 A클래스의 자식클래스이다
 */
public class D extends A{
	public D() {
		super();	//접근 가능
		this.field = "value";//접근 가능
		this.method();	//접근 가능  
	}
}
