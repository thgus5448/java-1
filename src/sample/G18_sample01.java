package sample;

import java.util.Date; //날짜 나오게하는거 근데 시간도 같이 나옴ㄷㄷ

class Goods{
	//필드선언
	String name;
	String import_date;
	
	//메소드
	void info_goods()
	{
		System.out.println("상품명:"+name);
		System.out.println("입고일자:"+import_date);
	}
}

public class G18_sample01 {
	public static void main(String[] args) {
		
		Date today=new Date();
		//my1
		Goods my1=new Goods();
		my1.name="펩시콜라제로";
		my1.import_date=today.toString();
		my1.info_goods(); //이거 꼭 호출해야 함. 안하면 안나와.
		System.out.println("\n");
		
		//my2
		Goods my2=new Goods();
		my2.name="빙그레)바나나우유";
		my2.import_date=today.toString();
		my2.info_goods();
		System.out.println("\n");
	}

}
