package sample;

class Mymenu {
	String name;
	int price;
void prn_info(String name, int price)
	{ 
		System.out.println("주문:"+name);
		System.out.println("가격:"+price+"원");
	}
}

public class G17_sample01 {
	public static void main(String[] args) {
	Mymenu my1=new Mymenu();
	my1.prn_info("아메리카노(M)",1500);
	System.out.printf("\n");
	//위의 방법 말고도 prn_info에서 이렇게 불러올 수 있음
	
	Mymenu my2=new Mymenu();
	my2.name = "카페라떼";
	my2.price = 2000;
	my2.prn_info(my2.name,my2.price);
	System.out.printf("\n");
	}

}
