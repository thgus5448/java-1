package Interface;

//인터페이스 
/* 주의 :public보다 더 낮은 접근 제한으로 작성 불가
 * 인터페이스의 기본 메소드는 기본적으로 public 접근 제한을 갖기 때문
 * 생략시 "Cannot reduce the visibility of the inherited method" 컴파일 에러 발생
 */
public interface RemoteControl {
	
	/* 상수 핃드(Constant Field)
	 * 인터페이스의 상수는 static{} 블록으로 초기화할 수 없기 때문에 반드시 선언과 동시에
	 * 초기값을 지정해야 함.
	 */
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 10;
	
	/*추상 메소드(Abstract Method)
	 * - 개체가 가지고 있는 메소드를 설명한 것. 
	 * - 호출할 때 어떤 매개값이 필요하고, 리턴 타입이 무엇인지만 알려줌(메소드 선언부만 작성)
	 * - 실제 실행부는 객체(구현 객체)가 가지고 있음
	 */
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	/* 디폴트 메소드(Default Method)
	 * - 자바8에서 추가된 인터페이스 멤버 
	 * 	 인터페이스 멤버로 허용한 이유 : 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위해
	 * - 실험 내용까지 작성
	 * - public 특성을 갖기 때문에 public을 생략하더라도 자동적으로 컴파일 과정에서 붙는다.
	 * - 인터페이스에 선언되지만 사실은 객체(구현 객체)가 가지고 있는 인스턴스 메소드라고 생각해야 함.
	 */
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	/* 정적 메소드(Static Method)
	 * - 자바8에서 추가된 인터페이스 멤버
	 * - 클래스의 정적 메소드와 형태 완전 동일
	 * - 객체가 없어도 인터페이스만드로 호출 가능
	 * - public 특성을 갖기 때문에 public을 생략하더라도 자동적으로 컴파일 과정에서 붙는다.
	 */
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
