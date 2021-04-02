package G15;

public class customer_out 
{
	public static void maon(String[] args)
	{
		customer_main RC=new royal_customer(50000);
		RC.getmessage();
		System.out.println("로얄고객 포인트"+RC.getsales());
		
		customer_main GC=new general_customer(23000);
		GC.getmessage();
		System.out.println("일반고객 포인트"+GC.getsales());
	}
}
