package sample;

public class G15_sample01 {
	public static void main(String[] args) {
		
		int[] coffee= {1000,1500,10000};
		String[] coffee_n=new String[] {"�Ƹ޸�ī��","����������","�����Ѿ��̽��Ƹ޸�ī��"};
			for(int c=0;c<3;c++)
			System.out.println(coffee_n[c]+" : "+coffee[c]+"��");
			
		
		int[] drink= {2000,2500,3000};
		String[] drink_n=new String[] {"�������ֽ�","���̽�Ƽ(������/����)","��Ʈ������"};
		for(int t=0;t<3;t++)
		System.out.println(drink_n[t]+" : "+drink[t]+"��");
		
		int[] latte= {3800,3500,2000};
		String[] latte_n=new String[] {"������","��ī��","ī���"};
		for(int l=0;l<3;l++)
		System.out.println(latte_n[l]+" : "+latte[l]+"��");
		
	}

}
