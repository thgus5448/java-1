package Protect1;

/* protected 접근제한자
 * 필드, 생성자, 메소드에 선언에 사용 가능.
 * 
 * 같은 패키지 : 접근에 제한 x (=defual)
 * 다른 패키지 : 자식 클래스에만 접근 허용
 */
public class A {
	//필드
	protected String field;
	
	//생성자
	protected A() { }
	
	//메소드
	protected void method() { }
}
