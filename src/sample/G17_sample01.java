package sample;

class Mymenu {
	String name;
	int price;
void prn_info(String name, int price)
	{ 
		System.out.println("�ֹ�:"+name);
		System.out.println("����:"+price+"��");
	}
}

public class G17_sample01 {
	public static void main(String[] args) {
	Mymenu my1=new Mymenu();
	my1.prn_info("�Ƹ޸�ī��(M)",1500);
	System.out.printf("\n");
	//���� ��� ���� prn_info���� �̷��� �ҷ��� �� ����
	
	Mymenu my2=new Mymenu();
	my2.name = "ī���";
	my2.price = 2000;
	my2.prn_info(my2.name,my2.price);
	System.out.printf("\n");
	}

}
