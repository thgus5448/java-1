package G15;

public class customer_main 
{
	public int pay; //고객의 구매 가격
	
	//생성자
	public customer_main(int pay)
	{
		this.pay=pay;
	}
	
	//적립
	public double getsales()
	{
		return pay*0;
	}
	
	//적립완료시 나올 메세지
	public void getmessage()
	{
		System.out.println("고객 구매금액의 1~3%적립");
	}
}
