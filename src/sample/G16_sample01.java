package sample;

public class G16_sample01 {
	public static void main(String[] args) {
		
		/*
		//规过1
		int[][] price= {{1000,1200,1500},{2000,2200,2500}};
		for (int i=0;i<price.length;i++) 
		{
			for(int j=0;j<price[0].length;j++)
				System.out.printf("%7d",price[i][j]);
		}
		*/
			
		
		//规过2
			int[][] price=new int[][] {{1000,1200,1500},{2000,2200,2500}};
			for (int i=0;i<price.length;i++) 
			{
				for(int i1[]:price)
				{
					for(int j:i1)
						System.out.printf("%7d",j);
						System.out.printf("\n");
				}
					
					
					
			}
		
	}		
	
}
