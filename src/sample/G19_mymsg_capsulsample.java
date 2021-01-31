package sample;

import java.util.Scanner;

class Exchange_currency{	//Exchange_currency - 클래스이름

	//필드선언
	long kor_cache;			//한국돈
	private int ex_cache;	//환율
	private double ex_perrate; //수수료
	private String irum;
		
	
	//수수료 계산하는 메소드
	void calc_currency(int ex_kind)	//calc_currency - 수수료계산 메소드 이름
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
	
	//환율단위 이름표시하는 메소드
	private void info_irum (int a)
	{
		String ex_irum="";	//1번은 뭐고 2번은 뭐고 이런거 이름 보이게
			
		switch(a) 
		{
			case 1:
				ex_irum="달러";
				break;
			case 2:
				ex_irum="엔화(100엔단위)";
				break;
			case 3:
				ex_irum="유로";
		}
		irum=ex_irum;
	}
		
		
		//환율계산하여 리턴하는 메소드 작성
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
	
		
		//출력결과를 표시하는 메소드 구현
		void calc_result()
		{
			long pay_cache;
			pay_cache=kor_cache/ex_cache;
			System.out.println("현찰금액"+kor_cache+"원");
			System.out.println("총 환전금액"+pay_cache+irum);
			System.out.println("총 환전수수료"+ex_perrate*pay_cache);
		}
	}	

public class G19_mymsg_capsulsample {
	public static void main (String[] args)
	{
		int num;
		long my_cache = 0;
		System.out.println("환전할 번호를 선택하세요.(1-us달러,2-엔화,3-유로화)");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("환전할 금액을 입력하세요");
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
