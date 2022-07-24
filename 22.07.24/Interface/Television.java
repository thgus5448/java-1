package Interface;

/* 구현 클래스 : 보통의 클래스와 동일한데, 인터페이스 타입으로 사용할 수 있음을 알려주기 위해  클래스 선언부에
 * implements 키워드를 추가하고 인터페이스명을 명시
 */
public class Television implements RemoteControl{
	
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	/* 인터페이스에 선언된 추상 메소드에 대응하는 실체 메소드를 구현 클래스가 작성하지 않으면?(일부만 구현 등)
	 * → 구현 클래스는 자동적으로 추상 클래스가 되기 때문에 abstrat 키워드를 추가해야 함.
	 */
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		//인터페이스의 상수를 이용해 volume 필드의 값을 제한
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
