package sample;

//급여계산기 상속메소드
public class Night_salary extends Basic_salary
{
	long danger_pay=50000;
	long special_pay=17000;
	
	public void night_work()
	{
		super.day_pay();	//슈퍼메소드 호출시 사용법 때 : 앞에 super. 쓰기!
		System.out.println("야간 총 일급여액="+(danger_pay+special_pay)+"원");
	}
}
