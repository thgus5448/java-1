package sample;

import java.util.Scanner;

//����Ŭ����
class circle_basic
	{
		int r;
		double pi=3.14;
		public void circle_width(int a)
		{
			r=a;
			System.out.println("���� ����="+(a*a*pi));
		}
	}

//���Ŭ����
class circle_outside extends circle_basic
	{
		public void outside_width()
		{
			System.out.println("������ ����="+(4*pi*(r*r)));
		}
	}

//�Է�
public class G20_sample01 {
	public static void main(String[]args)
	{
		int my_val;
		System.out.println("�������� �Է��ϼ���.");
		Scanner sc=new Scanner(System.in);
		my_val=sc.nextInt();
		
		circle_outside my_circle=new circle_outside();
		my_circle.circle_width(my_val);
		my_circle.outside_width();
		
	}

}
