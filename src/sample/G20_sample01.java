package sample;

import java.util.Scanner;

//슈퍼클래스
class circle_basic
	{
		int r;
		double pi=3.14;
		public void circle_width(int a)
		{
			r=a;
			System.out.println("원의 넓이="+(a*a*pi));
		}
	}

//상속클래스
class circle_outside extends circle_basic
	{
		public void outside_width()
		{
			System.out.println("원구의 넓이="+(4*pi*(r*r)));
		}
	}

//입력
public class G20_sample01 {
	public static void main(String[]args)
	{
		int my_val;
		System.out.println("반지름을 입력하세요.");
		Scanner sc=new Scanner(System.in);
		my_val=sc.nextInt();
		
		circle_outside my_circle=new circle_outside();
		my_circle.circle_width(my_val);
		my_circle.outside_width();
		
	}

}
