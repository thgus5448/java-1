package sample;

//급여계산기 입력
public class inherit {
	public static void main(String[]args)
	{
		Night_salary n_work =new Night_salary();
		n_work.work_time=7;
		n_work.work_pay=13000;
		n_work.night_work();
	}
}
