package G15;

public class royal_customer extends customer_main
{
	//������
	public royal_customer(int pay)
	{
		super(pay);
		//super : �θ�Ŭ������ ���� ���� �� �����ϰڴٴ� ��
	}
	
	//���� - �ξ��
	public double getsales()
	{
		return pay*0.05;
	}
	
	//�����ÿϷ�� ���� �޼��� - �ξ��
	public void getmessage()
	{
		System.out.println("�ξ�� ���űݾ��� 5%����");
	}
}
