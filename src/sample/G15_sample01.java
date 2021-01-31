package sample;

public class G15_sample01 {
	public static void main(String[] args) {
		
		int[] coffee= {1000,1500,10000};
		String[] coffee_n=new String[] {"아메리카노","에스프레소","따뜻한아이스아메리카노"};
			for(int c=0;c<3;c++)
			System.out.println(coffee_n[c]+" : "+coffee[c]+"원");
			
		
		int[] drink= {2000,2500,3000};
		String[] drink_n=new String[] {"오렌지주스","아이스티(복숭아/레몬)","민트프라페"};
		for(int t=0;t<3;t++)
		System.out.println(drink_n[t]+" : "+drink[t]+"원");
		
		int[] latte= {3800,3500,2000};
		String[] latte_n=new String[] {"녹차라떼","모카라떼","카페라떼"};
		for(int l=0;l<3;l++)
		System.out.println(latte_n[l]+" : "+latte[l]+"원");
		
	}

}
