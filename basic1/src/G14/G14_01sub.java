package G14;

//자식클래스
public class G14_01sub extends G14_01.circlemanage
{
	
	//생성자
	public G14_01sub()
	{
		System.out.println("원둘레 계산");
	}
	
	//원둘레 구하는 메소드
	public void dule_circle(int a)
	{
		int radius = a;
		System.out.println("원의 둘레:"+radius*2*pi);
	}
}
