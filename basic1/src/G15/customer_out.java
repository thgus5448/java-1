package G15;

public class customer_out 
{
	public static void maon(String[] args)
	{
		customer_main RC=new royal_customer(50000);
		RC.getmessage();
		System.out.println("�ξ�� ����Ʈ"+RC.getsales());
		
		customer_main GC=new general_customer(23000);
		GC.getmessage();
		System.out.println("�Ϲݰ� ����Ʈ"+GC.getsales());
	}
}
