package sample;

//�޿����� ��Ӹ޼ҵ�
public class Night_salary extends Basic_salary
{
	long danger_pay=50000;
	long special_pay=17000;
	
	public void night_work()
	{
		super.day_pay();	//���۸޼ҵ� ȣ��� ���� �� : �տ� super. ����!
		System.out.println("�߰� �� �ϱ޿���="+(danger_pay+special_pay)+"��");
	}
}
