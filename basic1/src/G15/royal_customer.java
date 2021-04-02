package G15;

public class royal_customer extends customer_main
{
	//생성자
	public royal_customer(int pay)
	{
		super(pay);
		//super : 부모클래스랑 값이 같을 때 참조하겠다는 뜻
	}
	
	//적립 - 로얄고객
	public double getsales()
	{
		return pay*0.05;
	}
	
	//적립시완료시 나올 메세지 - 로얄고객
	public void getmessage()
	{
		System.out.println("로얄고객 구매금액의 5%적립");
	}
}
