package sample;

import java.util.Date; //��¥ �������ϴ°� �ٵ� �ð��� ���� ���Ȥ���

class Goods{
	//�ʵ弱��
	String name;
	String import_date;
	
	//�޼ҵ�
	void info_goods()
	{
		System.out.println("��ǰ��:"+name);
		System.out.println("�԰�����:"+import_date);
	}
}

public class G18_sample01 {
	public static void main(String[] args) {
		
		Date today=new Date();
		//my1
		Goods my1=new Goods();
		my1.name="����ݶ�����";
		my1.import_date=today.toString();
		my1.info_goods(); //�̰� �� ȣ���ؾ� ��. ���ϸ� �ȳ���.
		System.out.println("\n");
		
		//my2
		Goods my2=new Goods();
		my2.name="���׷�)�ٳ�������";
		my2.import_date=today.toString();
		my2.info_goods();
		System.out.println("\n");
	}

}
