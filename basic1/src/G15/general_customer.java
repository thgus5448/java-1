package G15;

public class general_customer extends customer_main
{
	//������
	public general_customer(int pay)
	{
		super(pay);
		//super : �θ�Ŭ������ ���� ���� �� �����ϰڴٴ� ��
	}
	
	//���� - �Ϲݰ�
		public double getsales()
		{
			return pay*0.02;
		}
		
		//�����ÿϷ�� ���� �޼��� - �Ϲݰ�
		public void getmessage()
		{
			System.out.println("�Ϲݰ� ���űݾ��� 2%����");
		}
}
