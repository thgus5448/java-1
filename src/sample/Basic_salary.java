package sample;

//급여계산기 슈퍼메소드
public class Basic_salary
{
	int work_time;	
	long work_pay;	
	public void day_pay()	
	{ 
		System.out.println("일 급여액="+(work_time*work_pay)+"원");
	}
}