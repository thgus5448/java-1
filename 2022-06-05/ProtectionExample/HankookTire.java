package ProtectionExample;

public class HankookTire extends Tire{
	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);	// super() : 부모 클래스의 생성자를 호출하는 메소드
	}
	
	@Override
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " +
					(maxRotation-accumlatedRotation) + "회");
			return true;
		} else { 
			System.out.println("*** " + location + "HankkokTire 펑크 ***");
			return false;
		}
	}
}
