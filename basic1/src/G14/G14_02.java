package G14;
import java.util.Scanner;

public class G14_02 
{
	public void main(String[] args)
	{
		G14_01sub cir=new G14_01sub();
		
		int h;
		Scanner sc1=new Scanner(System.in);
		h=Integer.parseInt(sc1.next());
			//Integer.parseInt
			// -> String으로 입력받은 h값을 int로 변환해줌
		
		
		cir.neolbi_circle(h);
		cir.dule_circle(h);
	}
}
