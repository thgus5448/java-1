package sample;

import java.util.Scanner;

class Exchange_currency{	//Exchange_currency - Ŭ�����̸�

	//�ʵ弱��
	long kor_cache;			//�ѱ���
	private int ex_cache;	//ȯ��
	private double ex_perrate; //������
	private String irum;
		
	
	//������ ����ϴ� �޼ҵ�
	void calc_currency(int ex_kind)	//calc_currency - �������� �޼ҵ� �̸�
		{
			double con_rate=0.0;
			int result=0;
			switch(ex_kind) {
			case 1:
				con_rate=0.0187;
				break;
			case 2:
				con_rate=0.017;
				break;
			case 3:
				con_rate=0.019;
				break;
		}
		info_irum(ex_kind);
			result=info_currency(ex_kind);
			ex_perrate=result*con_rate;
	}
	
	//ȯ������ �̸�ǥ���ϴ� �޼ҵ�
	private void info_irum (int a)
	{
		String ex_irum="";	//1���� ���� 2���� ���� �̷��� �̸� ���̰�
			
		switch(a) 
		{
			case 1:
				ex_irum="�޷�";
				break;
			case 2:
				ex_irum="��ȭ(100������)";
				break;
			case 3:
				ex_irum="����";
		}
		irum=ex_irum;
	}
		
		
		//ȯ������Ͽ� �����ϴ� �޼ҵ� �ۼ�
		private int info_currency(int ex_kind) 
		{
			int kind=0;
			switch(ex_kind)
			{
				case 1:
					kind=1142;
					break;
				case 2:
					kind=1026;
					break;
				case 3:
					kind=1336;
			}
			ex_cache=kind;
			return kind;
		}
	
		
		//��°���� ǥ���ϴ� �޼ҵ� ����
		void calc_result()
		{
			long pay_cache;
			pay_cache=kor_cache/ex_cache;
			System.out.println("�����ݾ�"+kor_cache+"��");
			System.out.println("�� ȯ���ݾ�"+pay_cache+irum);
			System.out.println("�� ȯ��������"+ex_perrate*pay_cache);
		}
	}	

public class G19_mymsg_capsulsample {
	public static void main (String[] args)
	{
		int num;
		long my_cache = 0;
		System.out.println("ȯ���� ��ȣ�� �����ϼ���.(1-us�޷�,2-��ȭ,3-����ȭ)");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("ȯ���� �ݾ��� �Է��ϼ���");
		Scanner sc1=new Scanner(System.in);
		my_cache=sc.nextInt();
		sc.close();
		sc1.close();
		
		Exchange_currency my_currency=new Exchange_currency();
		my_currency.kor_cache=my_cache;
		my_currency.calc_currency(num);
		my_currency.calc_result();
	}

}
