package G14;

public class G14_01 
{
	
	//상위클래스 - public 기술시 독립적 클래스 생성
	public static class circlemanage
	{
		//멤버변수 - 반지름(radius),원주율(pi) 초기값 지정
		public int radius0;
		public double pi=3.14;
		
		//생성자
		//※주의※ 생성자는 상속이 되지 않는다! -> 실행결과 참조
		public circlemanage()
		{
			System.out.println("원의 넓이 계산");
		}
		
		//원넓이 구하는 메소드
		//a=asmple_inherit 파일로부터 입력될 반지름값을 받아들이기 위한 매개변수
		public void neolbi_circle(int a)
		{
			int radius = a;
			System.out.println("원의 넓이:"+radius*radius*pi);
		}
	}
}
