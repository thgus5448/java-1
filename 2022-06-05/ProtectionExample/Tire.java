package ProtectionExample;

public class Tire {
	//필드
	public int maxRotation;	//최대 회전수(타이어 수명)
	public int accumlatedRotation; //누적 회전수
	public String location; //타이어의 위치
	
	//생성자 - 타이어의 위치, 최대 회전수를 받아 각각의 필드에 저장.
	public Tire(String location, int maxRotation) {
		this.location = location;	//타이어의 위치 초기화
		this.maxRotation = maxRotation;	//최대 회전수(타이어 수명) 초기화
	}
	
	/* roll() 메소드
	 * 타이어를 1회전시키는 메소드. 1번 실행할 때마다 누적 회전수 +1
	 * 정상회전(true) - 누적 회전수 < 최대 회전수 : 남은 회전수 출력
	 * 펑크(false) - 누적 회전수 = 최대 회전수 : 펑크
	 */
	public boolean roll() {
		++accumlatedRotation;	//누적 회전수 1증가
		
		//정상회전 (누적<최대)일 경우 실행
		if(accumlatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + 
					(maxRotation-accumlatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
}
